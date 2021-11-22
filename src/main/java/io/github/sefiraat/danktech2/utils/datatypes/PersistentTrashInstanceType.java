package io.github.sefiraat.danktech2.utils.datatypes;

import de.jeff_media.morepersistentdatatypes.DataType;
import io.github.sefiraat.danktech2.core.DankPackInstance;
import io.github.sefiraat.danktech2.core.TrashPackInstance;
import io.github.sefiraat.danktech2.utils.Keys;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataAdapterContext;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.annotation.Nonnull;

/**
 * A {@link PersistentDataType} for {@link DankPackInstance}
 * Creatively thieved from {@see <a href="https://github.com/baked-libs/dough/blob/main/dough-data/src/main/java/io/github/bakedlibs/dough/data/persistent/PersistentUUIDDataType.java">PersistentUUIDDataType}
 *
 * @author Sfiguz7
 * @author Walshy
 */

public class PersistentTrashInstanceType implements PersistentDataType<PersistentDataContainer, TrashPackInstance> {

    public static final PersistentDataType<PersistentDataContainer, TrashPackInstance> TYPE = new PersistentTrashInstanceType();

    public static final NamespacedKey TRASH_ITEMS = Keys.newKey("trash_items");
    public static final NamespacedKey TRASH_TIER = Keys.newKey("trash_tier");
    public static final NamespacedKey TRASH_ID = Keys.newKey("trash_id");

    @Override
    @Nonnull
    public Class<PersistentDataContainer> getPrimitiveType() {
        return PersistentDataContainer.class;
    }

    @Override
    @Nonnull
    public Class<TrashPackInstance> getComplexType() {
        return TrashPackInstance.class;
    }

    @Override
    @Nonnull
    public PersistentDataContainer toPrimitive(@Nonnull TrashPackInstance complex, @Nonnull PersistentDataAdapterContext context) {
        PersistentDataContainer container = context.newPersistentDataContainer();
        container.set(TRASH_ITEMS, DataType.ITEM_STACK_ARRAY, complex.getItems());
        container.set(TRASH_TIER, DataType.INTEGER, complex.getTier());
        container.set(TRASH_ID, DataType.LONG, complex.getId());
        return container;
    }

    @Override
    @Nonnull
    public TrashPackInstance fromPrimitive(@Nonnull PersistentDataContainer primitive, @Nonnull PersistentDataAdapterContext context) {
        long id = primitive.get(TRASH_ID, DataType.LONG);
        int tier = primitive.get(TRASH_TIER, DataType.INTEGER);
        ItemStack[] items = primitive.get(TRASH_ITEMS, DataType.ITEM_STACK_ARRAY);
        TrashPackInstance instance = new TrashPackInstance(id, tier);
        instance.setItems(items);
        return instance;
    }
}
