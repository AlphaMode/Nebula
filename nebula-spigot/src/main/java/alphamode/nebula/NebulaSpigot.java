package alphamode.nebula;

import alphamode.nebula.Map.MapManager;
import lombok.Getter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class NebulaSpigot extends JavaPlugin {

    public static NebulaSpigot plugin;

    @Getter
    private MapManager mapManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        mapManager = new MapManager();

        mapManager.registerMaps();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
