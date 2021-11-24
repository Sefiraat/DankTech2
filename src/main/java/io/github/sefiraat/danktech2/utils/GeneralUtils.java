package io.github.sefiraat.danktech2.utils;

import lombok.experimental.UtilityClass;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

@UtilityClass
public class GeneralUtils {

    public static int getEmptySlots(Player player) {
        PlayerInventory inventory = player.getInventory();
        ItemStack[] cont = inventory.getStorageContents();
        int i = 0;
        for (ItemStack item : cont)
            if (item != null) {
                i++;
            }
        return 36 - i;
    }

}
