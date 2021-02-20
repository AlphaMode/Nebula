package map;

import lombok.Getter;

public class Map {
    @Getter
    private final String name;
    @Getter
    private final String path;

    public Map(String path, String name) {
        this.name = name;
        this.path = path;
    }

}
