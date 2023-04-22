package com.elland.dev.ellandtest.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

public class RemoveTestMobCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "플레이어만 이 명령어를 사용할 수 있습니다.");
            return true;
        }

        Player player = (Player) sender;
        int removedCount = 0;

        for (Entity entity : player.getWorld().getEntities()) {
            if (entity instanceof Zombie && entity.getCustomName() != null && entity.getCustomName().equals(ChatColor.GREEN + "테스트 몹")) {
                entity.remove();
                removedCount++;
            }
        }

        if (removedCount > 0) {
            sender.sendMessage(ChatColor.YELLOW + String.valueOf(removedCount) + "마리의 테스트 몹이 제거되었습니다.");
        } else {
            sender.sendMessage(ChatColor.YELLOW + "제거할 테스트 몹이 없습니다.");
        }

        return true;
    }

}
