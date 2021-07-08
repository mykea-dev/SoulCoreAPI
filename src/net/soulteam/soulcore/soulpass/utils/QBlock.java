package net.soulteam.soulcore.soulpass.utils;

import org.bukkit.Material;

public record QBlock(Material block, int count, String name) {
	public QBlock(final Material block, final int count, final String name) {
		this.block = block;
		this.count = count;
		this.name = "§c" + name + "§8 x§c" + getCount() + " §7";
	}

	public final Material getMaterial() {
		return block;
	}

	public final int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	@Override
	public final String toString() {
		return "QBlock{" + "block=" + block + ", name='" + name + '\'' + ", count=" + count + '}';
	}
}
