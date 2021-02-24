package map;

import game.Monument;
import game.MonumentBase;
import game.Team.Team;
import jdk.nashorn.internal.runtime.JSONListAdapter;
import lombok.Getter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

public class Map {
    @Getter private String id;
    @Getter private String name;
    @Getter private final String path;
    @Getter private boolean isValid;
    @Getter private java.util.Map<String,Team> teams;


    public MonumentBase[] getTeamMonuments(String teamId) {
        return teams.get(teamId).getMonuments();
    }

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
            JSONArray data = (JSONArray) mapInfo.get("teams");
            if(data == null) {
                System.out.println("Failed to load map: "+this.id+", invalid teams");
                return;
            }
        }
    }
}
