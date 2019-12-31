package com.funniray.osmpcore;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "osmp-core",
        name = "Osmp Core",
        description = "Open Source Minipack Core for Sponge",
        url = "https://funniray.com",
        authors = {
                "Funniray",
                "Birb"
        }
)
public class OsmpCoreSponge {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
