package xyz.tprj.fixburningformythicmobs.listeners;

import io.lumine.xikage.mythicmobs.api.bukkit.events.MythicMobSpawnEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustByBlockEvent;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.entity.EntityCombustEvent;

public class MythicMobsBurningListener implements Listener {
    @EventHandler
    public void onMythicMobSpawn(MythicMobSpawnEvent event) {
        if (event.getMobType().getConfig().getBoolean("Options.PreventSunburn", false)) {
            event.getEntity().addScoreboardTag("FixBurningForMythicMob");
        }
    }

    @EventHandler
    public void onEntityCombust(EntityCombustEvent event) {
        if (event instanceof EntityCombustByBlockEvent || event instanceof EntityCombustByEntityEvent) return;
        if (event.getEntity().getScoreboardTags().contains("FixBurningForMythicMob")) event.setCancelled(true);
    }

}
