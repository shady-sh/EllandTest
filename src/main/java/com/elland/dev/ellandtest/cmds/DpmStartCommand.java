package com.elland.dev.ellandtest.cmds;

import com.elland.dev.ellandtest.EllandTest;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DpmStartCommand implements CommandExecutor {
    EllandTest main = EllandTest.getPlugin(EllandTest.class);
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be run by a player.");
            return true;
        }
        Player player = (Player) sender;
        if (EllandTest.dpmMap.containsKey(player.getName())) {
            sender.sendMessage(ChatColor.RED + "- 이미 dpm을 측정중입니다. 약 1분뒤 다시 시도해주세요.");
            return true;
        }
        EllandTest.dpmMap.put(player.getName(), 0);
        sender.sendMessage(ChatColor.WHITE + "- dpm 측정이 시작되었습니다!");
        sender.sendMessage(ChatColor.YELLOW + "- 약 1분뒤 총합 데미지가 계산됩니다.");
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(main, new DpmTask(player), 60 * 20L);
        return true;
    }

    private static class DpmTask implements Runnable {
        private final Player player;

        public DpmTask(Player player) {
            this.player = player;
        }

        @Override
        public void run() {
            int dpm = EllandTest.dpmMap.remove(player.getName());
            player.sendMessage(ChatColor.BLUE + "- 1분간 데미지 총량: " + ChatColor.WHITE + dpm);
            player.sendMessage(ChatColor.YELLOW + "- 1초당 데미지: " + ChatColor.WHITE + dpm / 60.0 + "%");
        }
    }
}