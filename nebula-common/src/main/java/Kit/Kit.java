package Kit;

import Utils.TeamColor;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

public class Kit {

    public static final Kit DEFAULT;

    @Getter @Setter
    private Color color;

    public Kit() {
        this.color = TeamColor.WHITE.getColor();
    }

    public Kit(Color c) {
        this.color = c;
    }

    static {
      DEFAULT =  new Kit(TeamColor.WHITE.getColor());
    }

}
