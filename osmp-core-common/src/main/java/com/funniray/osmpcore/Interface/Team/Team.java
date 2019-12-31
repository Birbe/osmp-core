package com.funniray.osmpcore.Interface.Team;

import com.funniray.osmpcore.Interface.Entity.Player.Player;

import java.util.Collection;

public interface Team {

    public Collection<Player> getPlayers();

    public void addPlayer(Player player);

    public void removePlayer(Player player);

}
