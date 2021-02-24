package Utils;

import lombok.Getter;
import lombok.Setter;

public class Location {
    @Getter @Setter
    private int x,y,z;

    @Getter @Setter
    private boolean isBroken;

    public Location(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.isBroken = false;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Location) {
            Location temp = (Location) obj;
            if(temp.getX() == this.x && temp.getY() == this.y && temp.getZ() == this.z)
                return true;
        }
        return false;
    }
}
