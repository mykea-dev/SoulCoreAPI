package net.soulteam.soulcore.data.auction;

import net.soulteam.soulcore.Main;
import org.bukkit.inventory.ItemStack;

public record AuctionItem(Main plugin, ItemStack item, int cost, String owner) {
	public final int getCost() {
		return cost;
	}

	public final ItemStack getItem() {
		return item;
	}

	public final boolean delete() {
		return false;
	}
}
