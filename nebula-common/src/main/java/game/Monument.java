package game;

import Utils.Location;
import Utils.MonumentType;
import lombok.Getter;

public class Monument {

    @Getter private final MonumentType type;
    @Getter private final Location monumentLocation;
    @Getter private final Location[] monumentCoreArea;
    @Getter private final String id;
    @Getter private final String name;

    public Monument(Location loc,String id,String name) {
        this.type = MonumentType.SINGLE_BLOCK;
        this.monumentLocation = loc;
        this.monumentCoreArea = null;
        this.id = id;
        this.name = name;
    }
    public Monument(Location[] loc,String id,String name) {
        this.type = MonumentType.MULTI_BLOCK;
        this.monumentCoreArea = loc;
        this.monumentLocation = null;
        this.id = id;
        this.name = name;
    }
}