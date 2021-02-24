package game;

import Kit.KitManager;
import game.Team.TeamManager;
import lombok.Getter;
import map.Map;
import map.MapManager;

public class GameManager {


    private static GameManager gameManager;

    public static GameManager getGameManager() {
        return gameManager;
    }


    @Getter
    private final KitManager kitManager;

    @Getter
    private final TeamManager teamManager;

    @Getter
    private final MapManager mapManager;

    @Getter
    private final Map currentMap;

    public GameManager(MapManager mapManager, Map map) {
        this.currentMap = map;

        this.gameManager = this;
        this.mapManager = mapManager;
        this.teamManager = new TeamManager();
        this.kitManager = new KitManager();
    }
}
