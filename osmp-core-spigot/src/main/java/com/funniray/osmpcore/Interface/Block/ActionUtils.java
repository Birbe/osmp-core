package com.funniray.osmpcore.Interface.Block;

import java.util.HashMap;

public class ActionUtils {

    private static HashMap<org.bukkit.event.block.Action, Action> mappings = new HashMap<>();

    static {
        mappings.put(org.bukkit.event.block.Action.LEFT_CLICK_BLOCK,Action.LEFT_CLICK);
        mappings.put(org.bukkit.event.block.Action.LEFT_CLICK_AIR,Action.LEFT_CLICK_AIR);
        mappings.put(org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK,Action.RIGHT_CLICK);
        mappings.put(org.bukkit.event.block.Action.RIGHT_CLICK_AIR,Action.RIGHT_CLICK_AIR);
        mappings.put(org.bukkit.event.block.Action.PHYSICAL,Action.PHYSICAL);
    }

    public static Action bukkitToOSMCAction(org.bukkit.event.block.Action bukkit) {
        return mappings.get(bukkit);
    }

}
