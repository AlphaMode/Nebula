package Utils;

import lombok.Getter;
import lombok.Setter;

public class Location {
    @Getter @Setter
    private int x,y,z;

    public Location(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
