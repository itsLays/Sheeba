package rip.aurora;

import org.bukkit.plugin.java.JavaPlugin;

public class Shiba extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[Shiba] has been enabled!");

        this.getCommand("Diamond").setExecutor(new Diamond());
        this.getCommand("Iron").setExecutor(new Iron());
        this.getCommand("Heal").setExecutor(new Heal());
        this.getCommand("Feed").setExecutor(new Feed());
    }

    @Override
    public  void onDisable() {
        System.out.println("[Shiba] has been disabled!");
    }
}