package net.soulteam.soulcore.soulpass.utils;

import org.bukkit.inventory.ItemStack;

public record Item(ItemStack itemStack, String name) {
	public Item(final ItemStack itemStack, final String name) {
		this.itemStack = itemStack;
		this.name = itemStack.getAmount() == 1 ? "§c" + name : "§c" + name + "§8 x§c" + itemStack.getAmount();
	}

	public final ItemStack getItemStack() {
		return itemStack;
	}

	public final String getName() {
		return name;
	}

	@Override
	public final String toString() {
		return "Item{" + "name='" + name + '\'' + ", itemStack=" + itemStack + '}';
	}
}
