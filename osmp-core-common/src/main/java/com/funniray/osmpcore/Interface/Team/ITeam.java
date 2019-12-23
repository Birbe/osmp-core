package com.funniray.osmpcore.Interface.Team;

import com.funniray.osmpcore.Interface.Entity.Player.IPlayer;

import java.util.Collection;

public interface ITeam {

    public Collection<IPlayer> getPlayers();

    public void addPlayer(IPlayer player);

    public void removePlayer(IPlayer player);

}
