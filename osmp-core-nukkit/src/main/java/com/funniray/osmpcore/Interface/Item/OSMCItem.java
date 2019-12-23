package com.funniray.osmpcore.Interface.Item;

import cn.nukkit.item.Item;

public class OSMCItem implements IItem {

    private Item item;

    public OSMCItem(Item i) {
        this.item = i;
    }

    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public int getId() {
        return 0;
    }
}
