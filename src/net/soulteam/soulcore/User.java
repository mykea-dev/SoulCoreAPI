package net.soulteam.soulcore;

import net.md_5.bungee.api.chat.TextComponent;
import net.soulteam.soulcore.bosses.Boss;
import net.soulteam.soulcore.cases.utils.CaseType;
import net.soulteam.soulcore.clans.Clan;
import net.soulteam.soulcore.data.Auction;
import net.soulteam.soulcore.guard.Region;
import net.soulteam.soulcore.utils.enums.Group;
import net.soulteam.soulcore.utils.enums.Version;
import org.bukkit.entity.Player;

public interface User {

	/**
	 * to String
	 *
	 * @return name
	 */
	String toString();

	/**
	 * check exist player or not
	 *
	 * @return true - player exist
	 */
	boolean exists();

	/**
	 * get user name
	 *
	 * @return name
	 */
	String getName();

	/**
	 * get user last message
	 *
	 * @return last message
	 */
	String getLastMessage();

	/**
	 * set last message to the user
	 *
	 * @param message message to set
	 */
	void setLastMessage(final String message);

	/**
	 * get user clan
	 *
	 * @return clan
	 */
	Clan getClan();

	/**
	 * set clan to the user
	 *
	 * @param clan clan to set
	 */
	void setClan(final String clan);

	/**
	 * check is clan the user or not
	 *
	 * @return true - user in clan
	 */
	boolean isInClan();

	/**
	 * get user prefix
	 *
	 * @return active user prefix
	 */
	String getPrefix();

	/**
	 * set prefix to the user
	 *
	 * @param prefix to set
	 */
	void setPrefix(final String prefix);

	/**
	 * get user ip
	 *
	 * @return user ip
	 */
	String getIP();

	/**
	 * set last api to the user
	 *
	 * @param ip ip to set
	 */
	void setIP(final String ip);

	/**
	 * get level of the user
	 *
	 * @return level
	 */
	int getLevel();

	/**
	 * set level to the user
	 *
	 * @param lvl lvl to set
	 */
	void setLevel(final int lvl);

	/**
	 * add level to the user
	 *
	 * @param lvl lvl to add
	 */
	void addLevel(final int lvl);

	/**
	 * take level to the user
	 *
	 * @param lvl lvl to take
	 */
	void takeLevel(final int lvl);

	/**
	 * get xp booster
	 *
	 * @return booster
	 */
	double getBoost();

	/**
	 * get now xp
	 *
	 * @return xp
	 */
	int getXP();

	/**
	 * set xp to the user
	 *
	 * @param xp xp to set
	 */
	void setXP(final int xp);

	/**
	 * get need xp to following level
	 *
	 * @param lvl following level
	 * @return needed xp
	 */
	double getNeedXP(final int lvl);

	/**
	 * get user refs count
	 *
	 * @return refs count
	 */
	int getRefs();

	/**
	 * set refs to the user
	 *
	 * @param count refs to set
	 */
	void setRefs(final int count);
	void addRefs(final int count);
	void takeRefs(final int count);
	String getHomes();
	void setHomes(final String homes);
	void addXP(final int xp);
	int getMoney();
	void setMoney(final double amount);
	void addMoney(final double amount);
	boolean hasMoney(final double need);
	void takeMoney(final double amount);
	void takeXP(final int xp);
	boolean isMsgToggle();
	void setMsgToggle(final boolean value);
	boolean isTpToggle();
	void setTpToggle(final boolean value);
	boolean isGlobalChatEnabled();
	void setGlobalChatEnabled(final boolean value);
	boolean isLocalChatEnabled();
	void setLocalChatEnabled(final boolean value);
	boolean isClanChatEnabled();
	void setClanChatEnabled(final boolean value);
	boolean isShortChatEnabled();
	void setShortChatEnabled(final boolean value);
	boolean isOnline();
	boolean isRefEnabled();
	void setRefEnabled(final boolean value);
	boolean isRefOtherEnabled();
	void setRefOtherEnabled(final boolean value);
	String getLastTell();
	void setLastTell(final String player);
	void setJob(final String job);
	int getJobLevel();
	void setJobLevel(final int level);
	void takeJobLevel(final int level);
	int getJobXP();
	void setJobXP(final int xp);
	void takeJobXP(final int xp);
	void sendMessage(final String message);
	void sendMessage(final TextComponent component);
	Player getPlayer();
	int getRubles();
	Region getInRegion();
	Version getClientVersion();
	Boss getActiveBoss();
	void setActiveBoss(final Boss boss);
	double getBossDamage(final Boss boss);
	void addRubles(final double rubles);
	void takeRubles(final double rubles);
	void addBankMoney(final double money);
	void takeBankMoney(final double money);
	int getBankMoney();
	void sendVersionError(final Version version);
	boolean isClanOwner(final Clan clan);
	Group getGroup();
	boolean isIgnore(final String name);
	int getCases(final CaseType type);
	void giveCases(final CaseType type, final int count);
	void takeCases(final CaseType type, final int count);
	Auction getAuction();
	int getMaxAucItems();
}
