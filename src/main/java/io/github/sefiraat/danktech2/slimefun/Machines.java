package io.github.sefiraat.danktech2.slimefun;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.slimefun.machines.DankUpgrader;
import io.github.sefiraat.danktech2.theme.ThemeType;
import io.github.sefiraat.danktech2.utils.Skulls;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class Machines {

    @Getter
    private static DankUpgrader dankUpgrader;

    public static void setup() {
        final DankTech2 plugin = DankTech2.getInstance();

        // Upgrader
        dankUpgrader = new DankUpgrader(
            ItemGroups.MACHINES,
            ThemeType.themedSlimefunItemStack(
                "DK2_UPGRADER_1",
                Skulls.CELL_1.getPlayerHead(),
                ThemeType.MACHINE,
                "Dank Upgrader",
                "A Dank Cell serves to provide a way",
                "to make the inside bigger than the",
                "outside."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{

            }
        );

        // Slimefun Registry
        dankUpgrader.register(plugin);
    }
}
