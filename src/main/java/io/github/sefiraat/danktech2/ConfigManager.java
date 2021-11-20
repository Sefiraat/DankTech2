package io.github.sefiraat.danktech2;

import lombok.Getter;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class ConfigManager {

    @Getter
    private static ConfigManager instance;

    private final FileConfiguration dankPacks;

    public ConfigManager() {
        instance = this;

        this.dankPacks = getConfig("dank_packs.yml", false);
    }

    /**
     * @noinspection ResultOfMethodCallIgnored
     */
    private FileConfiguration getConfig(String fileName, boolean updateWithDefaults) {
        final DankTech2 plugin = DankTech2.getInstance();
        final File file = new File(plugin.getDataFolder(), fileName);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            plugin.saveResource(fileName, true);
        }
        final FileConfiguration config = new YamlConfiguration();
        try {
            config.load(file);
            if (updateWithDefaults) {
                updateConfig(config, file, fileName);
            }
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
        return config;
    }

    private void updateConfig(FileConfiguration config, File file, String fileName) throws IOException {
        final InputStream inputStream = DankTech2.getInstance().getResource(fileName);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        final YamlConfiguration defaults = YamlConfiguration.loadConfiguration(reader);
        config.addDefaults(defaults);
        config.options().copyDefaults(true);
        config.save(file);
    }

    public void saveAll() {
        DankTech2.getInstance().getLogger().info("DankTech2 saving data.");
        DankTech2.getInstance().saveConfig();
    }

    private void saveConfig(FileConfiguration configuration, String filename) {
        File file = new File(DankTech2.getInstance().getDataFolder(), filename);
        try {
            configuration.save(file);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static List<String> getBlacklistedWorldsPickup() {
        return DankTech2.getInstance().getConfig().getStringList("world_blacklist_pickup");
    }

    public static List<String> getBlacklistedWorldsOpen() {
        return DankTech2.getInstance().getConfig().getStringList("world_blacklist_open");
    }

    public static List<String> getBlacklistedWorldsBuild() {
        return DankTech2.getInstance().getConfig().getStringList("world_blacklist_build");
    }
}
