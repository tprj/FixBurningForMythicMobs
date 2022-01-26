package xyz.tprj.fixburningformythicmobs;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.tprj.fixburningformythicmobs.listeners.MythicMobsBurningListener;

public final class FixBurningForMythicMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new MythicMobsBurningListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
