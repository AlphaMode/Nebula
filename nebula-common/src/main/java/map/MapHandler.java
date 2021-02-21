package map;


public interface MapHandler {

    void registerMaps();
    Map getMap(String id);
    void loadMap(String id);
}
