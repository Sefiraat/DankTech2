package io.github.sefiraat.danktech2.listeners;

import io.github.sefiraat.danktech2.slimefun.packs.DankPack;
import io.github.sefiraat.danktech2.slimefun.packs.TrashPack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class CollectToCursorListener implements Listener {

    @EventHandler
    public void onCollect(InventoryClickEvent event) {
        final HumanEntity player = event.getWhoClicked();
        final ItemStack heldItem = player.getInventory().getItemInMainHand();
        final SlimefunItem slimefunItem = SlimefunItem.getByItem(heldItem);

        if (slimefunItem instanceof TrashPack || slimefunItem instanceof DankPack)
            if (event.getAction() == InventoryAction.COLLECT_TO_CURSOR)
                event.setCancelled(true);
    }
}
