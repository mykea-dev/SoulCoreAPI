package net.soulteam.soulcore.soulpass.quest;

import net.soulteam.soulcore.soulpass.Quest;
import net.soulteam.soulcore.soulpass.data.types.QuestType;
import net.soulteam.soulcore.soulpass.utils.Mob;

public abstract class MobQuest extends Quest {
	public abstract Mob getNeedMob();

	public QuestType getType() {
		return QuestType.MOB;
	}
}
