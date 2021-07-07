package net.soulteam.soulcore;

import net.minecraft.world.level.levelgen.HeightMap;
import net.soulteam.soulcore.clans.Clan;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private static Main instance;
	public static Main getInstance() {
		return instance;
	}

	@Override
	public void onEnable() {
		instance = this;
	}

	public static User getUser(final String name) {
		return null;
	}

	public static Clan getClanByName(final String name) {
		return null;
	}
}
