package com.funniray.osmpcore.Interface.Game;

import com.funniray.osmpcore.Interface.Entity.Player.IPlayer;
import com.funniray.osmpcore.Interface.Team.ITeam;

import java.util.Collection;

public interface IGame {

    public Collection<IPlayer> getParticipants();

    public Collection<ITeam> getTeams();

    public void addParticipant();

    public void registerTeam();

    public void startGame();

}
