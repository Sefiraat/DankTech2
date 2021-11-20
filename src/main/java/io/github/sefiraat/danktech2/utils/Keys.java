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

    @Nonnull
    public static NamespacedKey newKey(@Nonnull String value) {
        return new NamespacedKey(DankTech2.getInstance(), value);
    }
}
