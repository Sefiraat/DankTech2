package io.github.sefiraat.danktech2.core;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

public class TrashPackInstance {

    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private int tier;
    @Getter
    @Setter
    private ItemStack[] items = new ItemStack[18];

    public TrashPackInstance(long id, int tier) {
        this.tier = tier;
        this.id = id;
    }

    public ItemStack getItem(int index) {
        return items[index];
    }

    public void setItem(int index, ItemStack itemStack) {
        items[index] = itemStack.clone();
    }

    public void clearItem(int index) {
        items[index] = null;
    }

}
