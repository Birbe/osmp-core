package com.funniray.osmpcore.Interface.Game;

import com.funniray.osmpcore.Interface.World.Location;
import com.funniray.osmpcore.Interface.Team.Team;

import java.util.Collection;
import java.util.HashMap;

public interface GameMap {

    public String getName();

    public HashMap<Team, Collection<Location>> getSpawnLocations();

}
