package net.soulteam.soulcore.soulpass.quest;

import net.soulteam.soulcore.soulpass.Quest;
import net.soulteam.soulcore.soulpass.data.types.QuestType;
import net.soulteam.soulcore.soulpass.utils.QBlock;

public abstract class BreakQuest extends Quest {
	public abstract QBlock getNeedBlock();

	public QuestType getType() {
		return QuestType.BREAK;
	}
}
