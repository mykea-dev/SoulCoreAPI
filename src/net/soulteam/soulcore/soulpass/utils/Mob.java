package net.soulteam.soulcore.soulpass.utils;

import org.bukkit.entity.EntityType;

public record Mob(EntityType type, int count, String name) {
	public Mob(final EntityType type, final int count, final String name) {
		this.type = type;
		this.count = count;
		this.name = "§c" + name + "§8 x§c" + getCount() + " §7";
	}

	public final EntityType getType() {
		return type;
	}

	public final int getCount() {
		return count;
	}

	public final String getName() {
		return name;
	}

	@Override
	public final String toString() {
		return "Mob{" + "type=" + type + ", count=" + count + '}';
	}
}
