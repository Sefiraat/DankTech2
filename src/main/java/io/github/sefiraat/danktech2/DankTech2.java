package io.github.sefiraat.danktech2;

import io.github.sefiraat.danktech2.slimefun.ItemGroups;
import io.github.sefiraat.danktech2.slimefun.Materials;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.text.MessageFormat;

public class DankTech2 extends JavaPlugin implements SlimefunAddon {

    @Getter
    private static DankTech2 instance;

    private final String username;
    private final String repo;
    private final String branch;
    private GitHubBuildsUpdater updater;

    public DankTech2() {
        this.username = "Sefiraat";
        this.repo = "DankTech2";
        this.branch = "master";
    }

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("########################################");
        getLogger().info("         DankTech2 - By Sefiraat        ");
        getLogger().info("########################################");

        tryUpdate();

        setupSlimefun();

    }

    public void tryUpdate() {
        if (getConfig().getBoolean("auto-update")
            && getDescription().getVersion().startsWith("DEV")
        ) {
            String updateLocation = MessageFormat.format("{0}/{1}/{2}", this.username, this.repo, this.branch);
            updater = new GitHubBuildsUpdater(this, getFile(), updateLocation);
            updater.start();
        }
    }

    private void setupSlimefun() {
        ItemGroups.setup();
        Materials.setup();
    }

    @NotNull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return MessageFormat.format("https://github.com/{0}/{1}/issues/", this.username, this.repo);
    }

}
