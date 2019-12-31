package com.funniray.osmpcore;

import com.funniray.osmpcore.Command.CommandListener;
import com.funniray.osmpcore.Event.Event;
import com.funniray.osmpcore.Event.EventBus;
import com.funniray.osmpcore.Event.EventListener;
import com.funniray.osmpcore.JarLoader.JarLoader;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PackManager {

    private ArrayList<Minipack> minipacks;
    private JarLoader jarLoader;
    private EventBus eventBus;

    public PackManager() {
        minipacks = new ArrayList<>();
        jarLoader = new JarLoader();
        eventBus = new EventBus();
    }

    public void addMinipack(Minipack minipack) {
        this.minipacks.add(minipack);
    }

    public void loadJars() {
        try {
            ArrayList<File> jars = jarLoader.getJarsInPath(Paths.get("").normalize().resolve("minipacks/").toAbsolutePath().toFile());
            OSMC.log("Loading Minipacks...");
            for (File jar : jars) {
                OSMC.log("Loading a Minipack...");
                MinipackInfo info = jarLoader.getMinipackInfo(jar);
                Minipack minipack = jarLoader.loadMinipackJar(jar, info);
                addMinipack(minipack);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void registerListener(EventListener listener, Minipack pack) {
        eventBus.registerListener(listener, pack);
        OSMC.log("Registering listener of "+pack.getInfo().name);
    }

    public void registerCommandHandler(CommandListener listener, Minipack pack) {

    }

    public Event handleEvent(Event event) {
        return eventBus.handlEvent(event);
    }

    public void onEnable() {
        for(Minipack minipack : minipacks) {
            minipack.onEnable();
        }
    }

}
