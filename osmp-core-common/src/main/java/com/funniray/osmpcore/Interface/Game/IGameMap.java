package com.funniray.osmpcore.Interface.Game;

import com.funniray.osmpcore.Interface.World.ILocation;
import com.funniray.osmpcore.Interface.Team.ITeam;

import java.util.Collection;
import java.util.HashMap;

public interface IGameMap {

    public String getName();

    public HashMap<ITeam, Collection<ILocation>> getSpawnLocations();

}
