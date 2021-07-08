package net.soulteam.soulcore.soulpass.utils;

public record Prize(Item item, int lvl, int xp, int money) {
	public final Item getItem() {
		return item;
	}

	public final int getLvl() {
		return lvl;
	}

	public final int getXp() {
		return xp;
	}

	public final int getMoney() {
		return money;
	}

	@Override
	public final String toString() {
		return "Prize{" + "item=" + item + ", xp=" + xp + ", lvl=" + lvl + '}';
	}
}
