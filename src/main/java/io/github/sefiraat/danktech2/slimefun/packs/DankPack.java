package io.github.sefiraat.danktech2.slimefun.packs;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.inventory.ItemStack;

public class DankPack extends UnplaceableBlock {

    private final int slots;
    private final ItemSetting<Integer> capacityPerSlot;

    public DankPack(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int slots, int defaultCapacity) {
        super(itemGroup, item, recipeType, recipe);
        this.slots = slots;
        this.capacityPerSlot = new IntRangeSetting(this, "capacity_per_slot", 1, defaultCapacity, Integer.MAX_VALUE);
    }
}
