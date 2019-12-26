package com.funniray.osmpcore;

public class OSMC {

    private static PackManager packManager = new PackManager();

    public OSMC() {

    }

    public static PackManager getPackManager() {
        return packManager;
    }

    public static void log(String s) {
        System.out.println("[OSMC-Core] "+s);
    }

}
