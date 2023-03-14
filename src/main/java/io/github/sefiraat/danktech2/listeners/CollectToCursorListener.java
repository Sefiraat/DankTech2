package io.github.sefiraat.danktech2.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CollectToCursorListener implements Listener {

    @EventHandler
    public void onCollect(InventoryClickEvent event) {
        if (event.getAction() == InventoryAction.COLLECT_TO_CURSOR)
            event.setCancelled(true);
    }
}
