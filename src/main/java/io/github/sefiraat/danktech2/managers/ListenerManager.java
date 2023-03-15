package io.github.sefiraat.danktech2.managers;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.listeners.PackListener;
import io.github.sefiraat.danktech2.listeners.PickupListener;
import org.bukkit.event.Listener;

public class ListenerManager {

    public ListenerManager() {
        addListener(new PickupListener());
        addListener(new PackListener());
    }

    private void addListener(Listener listener) {
        DankTech2.getPluginManager().registerEvents(listener, DankTech2.getInstance());
    }

}
