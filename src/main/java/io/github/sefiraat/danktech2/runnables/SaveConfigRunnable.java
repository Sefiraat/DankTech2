package io.github.sefiraat.danktech2.runnables;

import io.github.sefiraat.danktech2.DankTech2;
import org.bukkit.scheduler.BukkitRunnable;

public class SaveConfigRunnable extends BukkitRunnable {

    @Override
    public void run() {
        DankTech2.getConfigManager().saveAll();
    }
}
