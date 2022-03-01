package rip.aurora;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Diamond implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack diamond = new ItemStack(Material.DIAMOND);
            diamond.setAmount(64);
            player.getInventory().addItem(diamond);
            player.sendMessage("You have been given Diamonds!");
        }
        return true;
    }
}