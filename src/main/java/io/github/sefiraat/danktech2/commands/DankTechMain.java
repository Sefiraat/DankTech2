package io.github.sefiraat.danktech2.commands;

import io.github.sefiraat.danktech2.core.AdminGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class DankTechMain implements CommandExecutor {

    public DankTechMain(JavaPlugin plugin) {
        plugin.getCommand("danktech2").setTabCompleter(new DankTechTabCompleter());
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isOp() && args.length >= 1) {
                if (args[0].equalsIgnoreCase("admingui")) {
                    return onAdminGUI(player);
                }
            }
        }
        return true;
    }

    public boolean onAdminGUI(Player player) {
        AdminGUI adminGUI = new AdminGUI();
        adminGUI.open(player);
        return true;
    }
}
