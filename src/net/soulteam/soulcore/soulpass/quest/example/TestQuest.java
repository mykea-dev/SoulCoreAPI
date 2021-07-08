package net.soulteam.soulcore.soulpass.quest.example;

import net.soulteam.soulcore.soulpass.data.types.EndType;
import net.soulteam.soulcore.soulpass.quest.ItemQuest;
import net.soulteam.soulcore.soulpass.utils.Item;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class TestQuest extends ItemQuest {
	@Override
	public final String getName() {
		return "item test";
	}

	@Override
	public final int getQuestId() {
		return 1;
	}

	@Override
	public int getSXP() {
		return 20;
	}

	@Override
	public Item getNeedItem() {
		return new Item(new ItemStack(Material.WHITE_SHULKER_BOX, 1), "шалкер");
	}

	@Override
	public EndType getEndType() {
		return EndType.DEBUG;
	}

	@Override
	public final ItemStack getDisplayItem() {
		final ItemStack display = new ItemStack(Material.WHITE_SHULKER_BOX, 1);
		final ItemMeta meta = display.getItemMeta();
		final List<String> lore = new ArrayList<>();
		lore.add("§8(§cCLICK§8) §7Чтобы взять квест");
		meta.setLore(lore);
		meta.setDisplayName("§7Квест §8- " + getName());
		display.setItemMeta(meta);
		return display;
	}
}
