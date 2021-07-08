package net.soulteam.soulcore.soulpass;

import net.soulteam.soulcore.soulpass.data.types.EndType;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public abstract class Quest {
	private static final Map<Integer, Quest> byId = new HashMap<>();
	private static final Map<String, Quest> byName = new HashMap<>();

	public static void registerQuest(final Quest quest) {
		if (!byId.containsKey(quest.getQuestId()) && !byName.containsKey(quest.getName())) {
			byId.put(quest.getQuestId(), quest);
			byName.put(quest.getName(), quest);
			return;
		}
		throw new IllegalArgumentException("Уже зарегистрирован.");
	}

	public static Quest getById(final int id) {
		return byId.get(id);
	}

	public static Quest getByName(final String name) {
		return byName.get(name);
	}

	public abstract String getName();

	public abstract int getQuestId();

	public abstract int getSXP();

	public abstract EndType getEndType();

	public abstract ItemStack getDisplayItem();
}
