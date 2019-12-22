package com.funniray.osmpcore.Game;

import com.funniray.osmpcore.Player.IPlayer;
import com.funniray.osmpcore.Team.ITeam;

import java.util.ArrayList;
import java.util.Collection;

public interface IGame {

    public Collection<IPlayer> getParticipants();

    public Collection<ITeam> getTeams();

    public void addParticipant();

    public void registerTeam();
}
