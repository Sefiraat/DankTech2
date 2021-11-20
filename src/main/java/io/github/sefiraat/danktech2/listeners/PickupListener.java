package io.github.sefiraat.danktech2.listeners;

import io.github.sefiraat.danktech2.ConfigManager;
import io.github.sefiraat.danktech2.slimefun.packs.DankPack;
import io.github.sefiraat.danktech2.slimefun.packs.TrashPack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class PickupListener implements Listener {

    @EventHandler
    public void onItemPickup(EntityPickupItemEvent e) {
        if (e.getEntity() instanceof Player) {
            final Player player = (Player) e.getEntity();

            if (ConfigManager.getBlacklistedWorldsPickup().contains(player.getWorld().getName())) {
                return;
            }

            for (ItemStack itemStack : player.getInventory().getContents()) {
                final SlimefunItem slimefunItem = SlimefunItem.getByItem(itemStack);

                if (slimefunItem instanceof DankPack && tryPickupItem(itemStack, e.getItem())) {
                    return;
                }
                if (slimefunItem instanceof TrashPack && tryVoidItem(itemStack, e.getItem())) {
                    return;
                }

            }
        }
    }

    public boolean tryPickupItem(ItemStack pack, Item item) {
        return false;
    }

    public boolean tryVoidItem(ItemStack pack, Item item) {
        return false;
    }


}
