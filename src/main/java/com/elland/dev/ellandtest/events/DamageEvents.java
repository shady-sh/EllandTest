package com.elland.dev.ellandtest.events;

import com.elland.dev.ellandtest.EllandTest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class DamageEvents implements Listener {
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Player)) {
            return;
        }
        Player player = (Player) event.getDamager();
        if (!EllandTest.dpmMap.containsKey(player.getName())) {
            return;
        }
        int dpm = EllandTest.dpmMap.get(player.getName());
        dpm += event.getFinalDamage();
        System.out.println("dpm 측정중.. Damage: " + dpm);
        EllandTest.dpmMap.put(player.getName(), dpm);
    }
}
