package game.Team;

import Utils.Location;
import game.GameManager;
import game.Monument;
import lombok.Getter;
import lombok.Setter;

public class Team {

    @Getter
    private Monument[] monuments;

    @Getter @Setter
    private Location spawn;

    @Getter @Setter
    private String name;

    @Getter
    private final String id;

    public Team(String id) {
        this.id = id;
        this.monuments = null;
    }
    public Team(String id,String name) {
        this.id = id;
        this.name = name;
        //this.monuments = GameManager.getGameManager();
    }
}
