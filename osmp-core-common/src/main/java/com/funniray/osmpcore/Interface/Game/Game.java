package com.funniray.osmpcore.Interface.Game;

import com.funniray.osmpcore.Interface.Entity.Player.Player;
import com.funniray.osmpcore.Interface.Team.Team;

import java.util.Collection;

public interface Game {

    public Collection<Player> getParticipants();

    public Collection<Team> getTeams();

    public void addParticipant();

    public void registerTeam();

    public void startGame();

}
