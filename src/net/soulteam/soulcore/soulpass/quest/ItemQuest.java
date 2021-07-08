package net.soulteam.soulcore.soulpass.quest;

import net.soulteam.soulcore.soulpass.Quest;
import net.soulteam.soulcore.soulpass.data.types.QuestType;
import net.soulteam.soulcore.soulpass.utils.Item;

public abstract class ItemQuest extends Quest {
	public abstract Item getNeedItem();

	public QuestType getType() {
		return QuestType.ITEM;
	}
}
