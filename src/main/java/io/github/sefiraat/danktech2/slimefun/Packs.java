package io.github.sefiraat.danktech2.slimefun;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.slimefun.packs.DankPack;
import io.github.sefiraat.danktech2.slimefun.packs.TrashPack;
import io.github.sefiraat.danktech2.theme.ThemeType;
import io.github.sefiraat.danktech2.utils.Skulls;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Packs {

    @Getter
    private static DankPack dankPack1;
    @Getter
    private static DankPack dankPack2;
    @Getter
    private static DankPack dankPack3;
    @Getter
    private static DankPack dankPack4;
    @Getter
    private static DankPack dankPack5;
    @Getter
    private static DankPack dankPack6;
    @Getter
    private static DankPack dankPack7;
    @Getter
    private static DankPack dankPack8;
    @Getter
    private static DankPack dankPack9;

    @Getter
    private static TrashPack trashPack1;
    @Getter
    private static TrashPack trashPack2;
    @Getter
    private static TrashPack trashPack3;
    @Getter
    private static TrashPack trashPack4;
    @Getter
    private static TrashPack trashPack5;
    @Getter
    private static TrashPack trashPack6;
    @Getter
    private static TrashPack trashPack7;
    @Getter
    private static TrashPack trashPack8;
    @Getter
    private static TrashPack trashPack9;


    public static void setup() {
        final DankTech2 plugin = DankTech2.getInstance();

        final ItemStack packCore = new ItemStack(Material.NETHERITE_INGOT);
        final ItemStack cell1 = Materials.getDankCell1().getItem();
        final ItemStack cell2 = Materials.getDankCell2().getItem();
        final ItemStack cell3 = Materials.getDankCell3().getItem();
        final ItemStack cell4 = Materials.getDankCell4().getItem();
        final ItemStack cell5 = Materials.getDankCell5().getItem();
        final ItemStack cell6 = Materials.getDankCell6().getItem();
        final ItemStack cell7 = Materials.getDankCell7().getItem();
        final ItemStack cell8 = Materials.getDankCell8().getItem();
        final ItemStack cell9 = Materials.getDankCell9().getItem();

        dankPack1 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_1",
                Skulls.PACK_1.getPlayerHead(),
                ThemeType.T1,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell1, cell1, cell1,
                cell1, packCore, cell1,
                cell1, cell1, cell1,
            },
            1,
            256
        );

        dankPack2 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_2",
                Skulls.PACK_2.getPlayerHead(),
                ThemeType.T2,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell2, cell2, cell2,
                cell2, dankPack1.getItem(), cell2,
                cell2, cell2, cell2,
            },
            2,
            256
        );

        dankPack3 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_3",
                Skulls.PACK_3.getPlayerHead(),
                ThemeType.T3,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell3, cell3, cell3,
                cell3, dankPack2.getItem(), cell3,
                cell3, cell3, cell3,
            },
            3,
            256
        );

        dankPack4 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_4",
                Skulls.PACK_4.getPlayerHead(),
                ThemeType.T4,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell4, cell4, cell4,
                cell4, dankPack3.getItem(), cell4,
                cell4, cell4, cell4,
            },
            4,
            256
        );

        dankPack5 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_5",
                Skulls.PACK_5.getPlayerHead(),
                ThemeType.T5,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell5, cell5, cell5,
                cell5, dankPack4.getItem(), cell5,
                cell5, cell5, cell5,
            },
            5,
            256
        );

        dankPack6 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_6",
                Skulls.PACK_6.getPlayerHead(),
                ThemeType.T6,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell6, cell6, cell6,
                cell6, dankPack5.getItem(), cell6,
                cell6, cell6, cell6,
            },
            6,
            256
        );

        dankPack7 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_7",
                Skulls.PACK_7.getPlayerHead(),
                ThemeType.T7,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell7, cell7, cell7,
                cell7, dankPack6.getItem(), cell7,
                cell7, cell7, cell7,
            },
            7,
            256
        );

        dankPack8 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_8",
                Skulls.PACK_8.getPlayerHead(),
                ThemeType.T8,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell8, cell8, cell8,
                cell8, dankPack7.getItem(), cell8,
                cell8, cell8, cell8,
            },
            8,
            256
        );

        dankPack9 = new DankPack(
            ItemGroups.PACKS,
            ThemeType.themedSlimefunItemStack(
                "DK2_PACK_9",
                Skulls.PACK_9.getPlayerHead(),
                ThemeType.T9,
                "Dank Pack",
                "A Dank Pack can hold many items",
                "inside it."
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell9, cell9, cell9,
                cell9, dankPack8.getItem(), cell9,
                cell9, cell9, cell9,
            },
            9,
            Integer.MAX_VALUE
        );

        // Slimefun Registry
        dankPack1.register(plugin);
        dankPack2.register(plugin);
        dankPack3.register(plugin);
        dankPack4.register(plugin);
        dankPack5.register(plugin);
        dankPack6.register(plugin);
        dankPack7.register(plugin);
        dankPack8.register(plugin);
        dankPack9.register(plugin);
    }

}
