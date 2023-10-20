package io.github.sefiraat.danktech2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DankTechTabCompleter implements TabCompleter {

    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        List<String> completions = new ArrayList<>();

        if (sender instanceof Player && args.length == 1) {
            Player player = (Player) sender;
            if (player.isOp()) {
                // Add tab completions here for the first argument
                completions.add("admingui");
                // You can add more options as needed
            }
        }

        // Filter completions based on what the player has typed so far
        String partialCommand = args[args.length - 1];
        completions.removeIf(option -> !option.startsWith(partialCommand));

        return completions;
    }
}
