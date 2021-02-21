package game;

import Utils.Location;
import lombok.Getter;
import lombok.Setter;

public class Team {
    @Getter @Setter
    private Location spawn;

    @Getter @Setter
    private String name;

    @Getter
    private final String id;

    public Team(String id) {
        this.id = id;

    }
}
