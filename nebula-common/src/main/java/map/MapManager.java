package map;

import com.grinderwolf.swm.api.SlimePlugin;
import com.grinderwolf.swm.api.loaders.SlimeLoader;
import com.grinderwolf.swm.api.world.SlimeChunk;
import com.grinderwolf.swm.api.world.properties.SlimeProperties;
import com.grinderwolf.swm.api.world.properties.SlimePropertyMap;
import game.GameManager;
import game.GameStatus;
import game.Monument;
import game.MonumentBase;
import lombok.Getter;
import lombok.SneakyThrows;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MapManager {
    private List<Map> maps = new ArrayList<>();

    private final SlimePlugin slimePlugin;

    private final Logger logger;
    private final String dir;

    @Getter
    private List<MonumentBase> totalMonuments;

    public MapManager(String path,Logger log,SlimePlugin pl) {
        this.logger = log;
        this.dir = path;
        this.slimePlugin = pl;
    }

    @SneakyThrows
    public void registerMaps() {
        File worlds = new File(dir+"/worlds");
        if(!worlds.exists()) {
            worlds.mkdirs();
        }
        for(File path : worlds.listFiles()) {
            logger.info("Registering map: "+path.getPath());
            Map map = new Map(path.getPath());
            if(map.isValid()) {
                maps.add(map);
                logger.info("Registered map: "+map.getId()+", "+map.getName());
            }
        }
    }

    public List<Map> getMaps() {
        return maps;
    }

    public Map getMap(String id) {
        for(Map m:maps) {
            if(m.getId() == id) {
                return m;
            }
        }
        logger.info("Map not found id: "+id);
        return null;
    }

    @SneakyThrows
    public void loadMap(String id) {
        GameManager.getGameManager().setStatus(GameStatus.LOADING_MAP);
        getMap(id).getTeams().forEach((tid,team)->{
            for (Monument monument:team.getMonuments()) {
                totalMonuments.add(monument);
            }
        });
        SlimeLoader loader = slimePlugin.getLoader("file");
        SlimePropertyMap properties = new SlimePropertyMap();
        properties.setValue(SlimeProperties.DIFFICULTY, "peaceful");

        slimePlugin.loadWorld(loader,id, true, properties);
    }
}
