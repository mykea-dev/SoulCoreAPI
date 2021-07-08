package net.soulteam.soulcore.soulpass.quest.example;

import net.soulteam.soulcore.soulpass.data.types.EndType;
import net.soulteam.soulcore.soulpass.quest.BreakQuest;
import net.soulteam.soulcore.soulpass.utils.QBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class TestQuest3 extends BreakQuest {
	@Override
	public final String getName() {
		return "break test";
	}

	@Override
	public final int getQuestId() {
		return 3;
	}

	@Override
	public int getSXP() {
		return 20;
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

	@Override
	public QBlock getNeedBlock() {
		return new QBlock(Material.BEDROCK, 1, "бедрок");
	}
}
