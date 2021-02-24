package game;

import Utils.Location;
import Utils.MonumentType;
import lombok.Getter;

import java.util.List;

public class Core implements MonumentBase {
    @Getter
    private List<Location> monumentCoreArea;
    @Getter private final MonumentType type;
    @Getter private Location monumentLocation;
    @Getter private final String id;
    @Getter private String name;
    private final int total;
    private int reminding;

    public Core(Location[] loc, String id, String name) {
        this.type = MonumentType.MULTI_BLOCK;
        this.id = id;
        int temp = 0;
        for (Location ignored : monumentCoreArea)
            temp++;
        total = temp;
        reminding = total;
    }

    public void Decrease() {
        reminding--;
    }

    public double getCoreProgress() {
        if(type == MonumentType.MULTI_BLOCK) {
            return ((total-reminding) / total) * 100;
        }
        return -1;
    }
}
