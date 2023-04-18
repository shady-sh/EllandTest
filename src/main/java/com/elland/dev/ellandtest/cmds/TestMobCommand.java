package com.elland.dev.ellandtest.cmds;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TestMobCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "플레이어만 이 명령어를 사용할 수 있습니다.");
            return true;
        }

        if (args.length == 0) {
            sender.sendMessage(ChatColor.GOLD + "/테스트몹 <숫자> - 숫자 마리 만큼 테스트 몹을 소환합니다.");
            return true;
        }

        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            sender.sendMessage(ChatColor.RED + "숫자를 입력해주세요.");
            return true;
        }

        Player player = (Player) sender;
        for (int i = 0; i < number; i++) {
            Zombie zombie = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
            zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(50000.0);
            zombie.setHealth(50000.0);
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10000000, 1));
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 10000000, 1));
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10000000, 0));
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10000000, 2));
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000, 0));
            zombie.setCustomName(ChatColor.GREEN + "테스트 몹");
        }

        sender.sendMessage(ChatColor.YELLOW + String.valueOf(number) + "마리의 테스트 몹이 소환되었습니다.");
        return true;
    }
}
