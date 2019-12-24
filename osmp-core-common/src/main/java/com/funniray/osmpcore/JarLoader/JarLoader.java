package com.funniray.osmpcore.JarLoader;

import com.funniray.osmpcore.Minipack;
import com.funniray.osmpcore.MinipackInfo;
import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class JarLoader {

    public ArrayList<File> getJarsInPath(File file) throws IOException, NoSuchMethodException {
        ArrayList<File> out = new ArrayList<File>();
        Files.list(file.toPath()).forEach(path -> {
            if(path.endsWith(".jar")) {
                out.add(path.toFile());
            }
        });
        return out;
    }

    public MinipackInfo getMinipackInfo(File file) throws IOException {
        ZipFile zipFile = new ZipFile(file);

        ZipEntry minipack = zipFile.getEntry("minipack.json");
        Gson gson = new Gson();

        String text = null;
        try (Scanner scanner = new Scanner(zipFile.getInputStream(minipack), StandardCharsets.UTF_8.name())) {
            text = scanner.useDelimiter("\\A").next();
        }

        return gson.fromJson(text, MinipackInfo.class);
    }

    public Minipack loadMinipackJar(File file, String mainClass) throws MalformedURLException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {
        URLClassLoader child = new URLClassLoader(
                new URL[]{file.toURI().toURL()},
                this.getClass().getClassLoader()
        );

        Class classToLoad = Class.forName(mainClass, true, child);
        Minipack minipack = (Minipack) classToLoad.newInstance();
        return minipack;
    }

}
