package pl.kukoldy.tab;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player p : Bukkit.getOnlinePlayers()) {

                    String header =
                            "§8════════════════════════════\n" +
                            "      §b§lKUKOLDY.PL\n" +
                            "   §7Minecraft §f1.20.4\n" +
                            "§8════════════════════════════\n" +
                            "§7Online: §a" + Bukkit.getOnlinePlayers().size() +
                            "§7/§a" + Bukkit.getMaxPlayers() +
                            "   §7Ping: §f" + p.getPing() + "ms";

                    String footer =
                            "\n§8════════════════════════════\n" +
                            "§7IP: §b kukoldy.pl\n" +
                            "§8════════════════════════════";

                    p.setPlayerListHeaderFooter(header, footer);
                }
            }
        }.runTaskTimer(this, 0L, 60L);
    }
}
