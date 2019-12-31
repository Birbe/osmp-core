package com.funniray.osmpcore.Interface.World;

import com.funniray.osmpcore.Interface.Block.Block;

public class Location {

    private World world;
    private double x;
    private double y;
    private double z;

    private float yaw;
    private float pitch;

    public Location(World world, double x, double y, double z, float yaw, float pitch) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.yaw = yaw;
        this.pitch = pitch;

        this.world = world;
    }

    public World getWorld() {
        return world;
    };

    public Block getBlock() {
        return world.getBlockAt((int)x,(int)y,(int)z);
    }

    public double getX() {
        return x;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

}
