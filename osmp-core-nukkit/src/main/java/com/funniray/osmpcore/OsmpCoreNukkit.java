package com.funniray.osmpcore;

import cn.nukkit.plugin.PluginBase;

public final class OsmpCoreNukkit extends PluginBase {

    @Override
    public void onEnable() {
        // Plugin startup logic
        OSMC.getPackManager().loadJars();
        OSMC.getPackManager().onEnable();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
