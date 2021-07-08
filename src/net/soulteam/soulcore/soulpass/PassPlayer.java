package net.soulteam.soulcore.soulpass;

import net.soulteam.soulcore.soulpass.quest.BreakQuest;
import net.soulteam.soulcore.soulpass.quest.ItemQuest;
import net.soulteam.soulcore.soulpass.quest.MobQuest;
import net.soulteam.soulcore.soulpass.utils.Prize;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface PassPlayer {
	void giveItem(final ItemStack item);

	void setOnFile(final String patch, final Object value);

	Player player();

	void addXp(final int xp);

	void addLvl(final int lvl);

	void addMoney(final int money);

	void sendMessage(final String message);

	void setUp();

	boolean isSetUp();

	String getActiveQuestType();

	void addMobQuest(final MobQuest quest);

	void endMobQuest(final MobQuest quest);

	void addKilledMobs(final int count);

	void addItemQuest(final ItemQuest quest);

	void endItemQuest(final ItemQuest quest);

	void addGaveItems(final int count);

	void addBreakQuest(final BreakQuest quest);

	void endBreakQuest(final BreakQuest quest);

	void addBreakBlocks(final int count);

	void givePrize(final Prize prize);

	void giveTestPrizes();

	int getActiveQuestId();

	void addPrize(final Prize prize);

	boolean isTake(final int quest);
}