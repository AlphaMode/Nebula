package map;

import lombok.Getter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

public class Map {
    @Getter private String id;
    @Getter private String name;
    @Getter private final String path;
    @Getter private boolean isValid;

    public Map(String path) throws Exception {
        this.path = path;
        File location = new File(path+"/map.json");
        if(!location.exists()||!location.canRead()) {
            System.out.println("Failed to load map (Readable:"+location.canRead()+" ) : "+path);
            this.isValid = false;
        }else{
            FileReader reader = new FileReader(location);
            Object obj = new JSONParser().parse(reader);
            JSONObject mapInfo = (JSONObject) obj;
            this.id = (String) mapInfo.get("id");
            this.name = (String) mapInfo.get("name");
            this.isValid = true;
        }
    }
}
