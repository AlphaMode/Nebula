package alphamode.nebula;

import com.grinderwolf.swm.api.SlimePlugin;
import game.GameManager;
import lombok.Getter;
import map.MapManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class NebulaSpigot extends JavaPlugin {

    public static NebulaSpigot plugin;

    @Getter
    private MapManager mapManager;
    @Getter
    private GameManager gameManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        mapManager = new MapManager(NebulaSpigot.plugin.getDataFolder().getPath(),Bukkit.getLogger(),(SlimePlugin) Bukkit.getPluginManager().getPlugin("SlimeWorldManager"));

        mapManager.registerMaps();

        gameManager = new GameManager(mapManager,mapManager.getMap(mapManager.getMaps().get(new Random().nextInt(mapManager.getMaps().size())).getId()));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
