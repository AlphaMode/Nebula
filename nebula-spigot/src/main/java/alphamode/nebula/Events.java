package alphamode.nebula;

import Utils.Location;
import Utils.MonumentType;
import alphamode.nebula.Map.Events.MonumentBreakEvent;
import game.Monument;
import game.Team.Team;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Events implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        org.bukkit.Location bLoc = e.getBlock().getLocation();
        for (Team team: NebulaSpigot.plugin.getGameManager().getTeamManager().getTeams()) {

        }
    }

}
