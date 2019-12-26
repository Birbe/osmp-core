package com.funniray.osmpcore;

import com.funniray.osmpcore.Event.EventListener;

public abstract class Minipack {

    public EventListener eventHandler;
    public MinipackInfo info;

    public Minipack() {}

    public void onEnable() {

    }

    public void onDisable() {

    }

    public MinipackInfo getInfo() {
        return info;
    }
}
