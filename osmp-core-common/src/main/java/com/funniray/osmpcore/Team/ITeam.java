package com.funniray.osmpcore.Team;

import com.funniray.osmpcore.Player.IPlayer;

import java.util.Collection;

public interface ITeam {

    public Collection<IPlayer> getPlayers();

    public void addPlayer(IPlayer player);

    public void removePlayer(IPlayer player);

}
