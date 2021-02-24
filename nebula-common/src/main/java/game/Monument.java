package game;

import Utils.Location;
import Utils.MonumentType;
import lombok.Getter;

public class Monument implements MonumentBase {

    @Getter protected final MonumentType type;
    @Getter protected Location monumentLocation;
    @Getter protected final String id;
    @Getter protected String name;

    public Monument(Location loc,String id,String name) {
        this.type = MonumentType.SINGLE_BLOCK;
        this.monumentLocation = loc;
        this.id = id;
        this.name = name;
    }
    public Monument(String id,String name) {
        this.type = MonumentType.MULTI_BLOCK;
        this.id = id;
        this.name = name;
    }





}