package net.soulteam.soulcore.soulpass.quest.example;

import net.soulteam.soulcore.soulpass.data.types.EndType;
import net.soulteam.soulcore.soulpass.quest.MobQuest;
import net.soulteam.soulcore.soulpass.utils.Mob;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class TestQuest2 extends MobQuest {
	@Override
	public final String getName() {
		return "mob test";
	}

	@Override
	public final int getQuestId() {
		return 2;
	}

	@Override
	public int getSXP() {
		return 30;
	}

	@Override
	public Mob getNeedMob() {
		return new Mob(EntityType.SHULKER, 1, "шалкер");
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
