package io.github.sefiraat.danktech2.slimefun;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.slimefun.machines.DankCrafter;
import io.github.sefiraat.danktech2.slimefun.machines.DankUnloader;
import io.github.sefiraat.danktech2.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class Machines {

    @Getter
    private static DankCrafter dankCrafter;
    @Getter
    private static DankUnloader dankUnloader;

    public static void setup() {
        final DankTech2 plugin = DankTech2.getInstance();

        // Crafter
        dankCrafter = new DankCrafter(
            ItemGroups.MACHINES,
            ThemeType.themedSlimefunItemStack(
                "DK2_CRAFTER_1",
                new ItemStack(Material.JUKEBOX),
                ThemeType.MACHINE,
                "Dank Crafter",
                "Crafts and upgrades Dank Packs."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{

            }
        );

        // Unloader
        dankUnloader = new DankUnloader(
            ItemGroups.MACHINES,
            ThemeType.themedSlimefunItemStack(
                "DK2_UNLOADER_1",
                new ItemStack(Material.JUKEBOX),
                ThemeType.MACHINE,
                "Dank Unloader",
                "Pulls out items from your Dank Packs"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{

            }
        );

        // Slimefun Registry
        dankCrafter.register(plugin);
        dankUnloader.register(plugin);
    }
}
