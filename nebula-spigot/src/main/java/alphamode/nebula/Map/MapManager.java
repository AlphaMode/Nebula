package alphamode.nebula.Map;

import alphamode.nebula.NebulaSpigot;
import lombok.SneakyThrows;
import map.Map;
import map.MapHandler;
import org.bukkit.Bukkit;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MapManager implements MapHandler {

    private List<Map> maps = new ArrayList<>();

    @SneakyThrows
    @Override
    public void registerMaps() {
        File worlds = new File(NebulaSpigot.plugin.getDataFolder().getPath()+"/worlds");
        if(!worlds.exists()) {
            worlds.mkdirs();
        }
        for(File path : worlds.listFiles()) {
            Bukkit.getLogger().info("Registering map: "+path.getPath());
            Map map = new Map(path.getPath());
            if(map.isValid()) {
                maps.add(map);
                Bukkit.getLogger().info("Registered map: "+map.getId()+", "+map.getName());
            }
        }
    }

    @Override
    public Map getMap(String id) {
        // Clould also use a hashmap instead but there are already to many maps lol
        for (Map m:
             maps) {
            if(m.getId().equals(id))
                return m;
        }
        return null;
    }

    @Override
    public void loadMap(String id) {

    }
}
