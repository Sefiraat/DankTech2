package io.github.sefiraat.danktech2.utils;

import io.github.sefiraat.danktech2.DankTech2;
import lombok.Data;
import org.bukkit.NamespacedKey;

import javax.annotation.Nonnull;

@Data
public class Keys {

    private Keys() {
        throw new IllegalStateException("Utility Class");
    }

    // DankPack Storage
    public static final NamespacedKey DANK_INSTANCE = Keys.newKey("dank_instance");
    public static final NamespacedKey DANK_SELECTED_SLOT = Keys.newKey("dank_slot");
    public static final NamespacedKey TRASH_INSTANCE = Keys.newKey("trash_instance");

    @Nonnull
    public static NamespacedKey newKey(@Nonnull String value) {
        return new NamespacedKey(DankTech2.getInstance(), value);
    }
}
