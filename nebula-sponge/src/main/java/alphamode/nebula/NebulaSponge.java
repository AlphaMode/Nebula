package alphamode.nebula;

import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;
import org.spongepowered.api.Server;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.lifecycle.StartingEngineEvent;
import org.spongepowered.plugin.jvm.Plugin;

@Plugin("nebula-sponge")
public class NebulaSponge {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(StartingEngineEvent<Server> event) {
    }
}
