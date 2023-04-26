package com.elland.dev.ellandtest;

import com.elland.dev.ellandtest.cmds.DpmStartCommand;
import com.elland.dev.ellandtest.cmds.RemoveTestMobCommand;
import com.elland.dev.ellandtest.cmds.TestMobCommand;
import com.elland.dev.ellandtest.events.DamageEvents;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class EllandTest extends JavaPlugin {
    public static HashMap<String, Double> dpmMap = new HashMap<>();

    @Override
    public void onEnable() {
        getCommand("dpm-start").setExecutor(new DpmStartCommand());
        getCommand("test-mob").setExecutor(new TestMobCommand());
        getCommand("test-mob-remove").setExecutor(new RemoveTestMobCommand());
        getServer().getPluginManager().registerEvents(new DamageEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
