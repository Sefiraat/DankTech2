package io.github.sefiraat.danktech2.core;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

public class DankPackInstance {

    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private int tier;
    @Getter
    @Setter
    private ItemStack[] items = new ItemStack[9];
    @Getter
    @Setter
    private int[] amounts = new int[9];

    public DankPackInstance(long id, int tier) {
        this.tier = tier;
        this.id = id;
    }

    public ItemStack getItem(int index) {
        return items[index];
    }

    public int getAmount(int index) {
        return amounts[index];
    }

    public void setItem(int index, ItemStack itemStack) {
        items[index] = itemStack.clone();
    }

    public void clearItem(int index) {
        items[index] = null;
        amounts[index] = 0;
    }

    public void setAmount(int index, int amount) {
        amounts[index] = amount;
    }
}
