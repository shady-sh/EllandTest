package com.elland.dev.ellandtest;

import com.elland.dev.ellandtest.cmds.TestMobCommand;
import com.elland.dev.ellandtest.events.DamageEvents;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class EllandTest extends JavaPlugin {
    public static HashMap<String, Integer> dpmMap = new HashMap<String, Integer>();

    @Override
    public void onEnable() {
        getCommand("test-mob").setExecutor(new TestMobCommand());
        getServer().getPluginManager().registerEvents(new DamageEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
