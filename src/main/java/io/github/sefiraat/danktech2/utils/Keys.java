package io.github.sefiraat.danktech2.utils;

import io.github.sefiraat.danktech2.DankTech2;
import lombok.Data;
import lombok.experimental.UtilityClass;
import org.bukkit.NamespacedKey;

import javax.annotation.Nonnull;

@Data
@UtilityClass
public class Keys {

    // DankPack Storage
    public static final NamespacedKey DANK_INSTANCE = Keys.newKey("dank_instance");
    public static final NamespacedKey DANK_SELECTED_SLOT = Keys.newKey("dank_slot");
    public static final NamespacedKey TRASH_INSTANCE = Keys.newKey("trash_instance");

    // Entity
    public static final NamespacedKey DISPLAY_STAND = Keys.newKey("display");

    @Nonnull
    public static NamespacedKey newKey(@Nonnull String value) {
        return new NamespacedKey(DankTech2.getInstance(), value);
    }
}
