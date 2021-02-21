package Utils;

import lombok.Getter;

import java.awt.*;

public enum TeamColor {
    RED(new Color(11546150)),
    ORANGE(new Color(16351261)),
    YELLOW(new Color(16701501)),
    LIME(new Color(8439583)),
    GREEN(new Color(6192150)),
    LIGHT_BLUE(new Color(3847130)),
    CYAN(new Color(1481884)),
    BLUE(new Color(3949738)),
    PURPLE(new Color(8991416)),
    MAGENTA(new Color(13061821)),
    PINK(new Color(15961002)),
    WHITE(new Color(16383998)),
    LIGHT_GRAY(new Color(10329495)),
    GRAY(new Color(4673362)),
    BLACK(new Color(1908001)),
    BROWN(new Color(8606770));

    @Getter
    private Color color;

    TeamColor(Color c) {
        this.color = c;
        new Color(3847130);
    }
}
