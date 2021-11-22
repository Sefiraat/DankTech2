package io.github.sefiraat.danktech2.slimefun.packs;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

public class DankPack extends UnplaceableBlock {

    @Getter
    private final int tier;
    @Getter
    private final int slots;
    @Getter
    private final ItemSetting<Integer> capacityPerSlot;

    public DankPack(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int tier, int defaultCapacity) {
        super(itemGroup, item, recipeType, recipe);
        this.tier = tier;
        this.slots = tier;
        this.capacityPerSlot = new IntRangeSetting(this, "capacity_per_slot", 1, defaultCapacity, Integer.MAX_VALUE);
        addItemSetting(capacityPerSlot);
    }
}
