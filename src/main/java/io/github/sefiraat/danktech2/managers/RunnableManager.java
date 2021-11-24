package io.github.sefiraat.danktech2.managers;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.runnables.SaveConfigRunnable;
import lombok.Getter;

public class RunnableManager {

    @Getter
    public final SaveConfigRunnable saveConfigRunnable;

    public RunnableManager() {
        DankTech2 plugin = DankTech2.getInstance();

        this.saveConfigRunnable = new SaveConfigRunnable();
        this.saveConfigRunnable.runTaskTimer(plugin, 1, 12000);
    }
}
