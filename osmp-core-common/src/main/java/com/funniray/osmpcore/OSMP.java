package com.funniray.osmpcore;

import com.funniray.osmpcore.Events.Event;
import com.funniray.osmpcore.Events.EventBus;
import com.funniray.osmpcore.Events.EventListener;
import com.funniray.osmpcore.JarLoader.JarLoader;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class OSMP {

    private ArrayList<Minipack> minipacks = new ArrayList<>();
    private JarLoader jarLoader;
    private EventBus eventBus;

    public OSMP() {
        jarLoader = new JarLoader();
        eventBus = new EventBus();

        try {
            ArrayList<File> jars = jarLoader.getJarsInPath(Paths.get("").normalize().resolve("minipacks/").toAbsolutePath().toFile());
            for (File jar : jars) {
                MinipackInfo info = jarLoader.getMinipackInfo(jar);
                Minipack minipack = jarLoader.loadMinipackJar(jar, info.mainClass);
            }
        } catch(Exception e) {

        }
    }

    public void registerListener(EventListener listener, Minipack pack) {
        eventBus.registerListener(listener, pack);
    }

    public void onEnable() {
        for(Minipack minipack : minipacks) {
            minipack.onEnable();
        }
    }

    public void addMinipack(Minipack minipack) {
        this.minipacks.add(minipack);
    }

}
