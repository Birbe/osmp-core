package com.funniray.osmpcore;

import com.funniray.osmpcore.Util.Factory;

public class OSMC {

    private static PackManager packManager = new PackManager();
    private static Factory factory;

    public OSMC() {

    }

    public static PackManager getPackManager() {
        return packManager;
    }

    public static void log(String s) {
        System.out.println("[OSMC-Core] "+s);
    }

    public static void setFactory(Factory factoryIn) {
        factory = factoryIn;
    }

    public static Factory getFactory() {
        return factory;
    }

}
