package alphamode.nebula.Map.Events;

import Utils.MonumentType;
import game.Events.MonumentBreak;
import game.Monument;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MonumentBreakEvent extends Event implements MonumentBreak, Cancellable {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    @Getter @Setter
    private boolean isCancelled;
    @Getter private final Monument monument;

    public MonumentBreakEvent(Monument monument) {
        this.monument = monument;

    }

    public boolean isCore() {
        return this.monument.getType() == MonumentType.MULTI_BLOCK;
    }

    @NonNull
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

}
