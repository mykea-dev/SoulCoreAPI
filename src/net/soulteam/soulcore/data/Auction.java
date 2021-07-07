package net.soulteam.soulcore.data;

import net.soulteam.soulcore.Main;
import net.soulteam.soulcore.data.auction.AuctionItem;
import org.bukkit.inventory.ItemStack;

public record Auction(Main plugin, String aName) {

	public final boolean contains() {
		return false;
	}

	public final int getItems(){
		return -1;
	}

	public final AuctionItem getItem(final ItemStack item, final int money) {
		return null;
	}

	public final void addItem(final ItemStack item, final int money) {
	}

	public final boolean removeItem(final ItemStack item, final int money) {
		return false;
	}
}
