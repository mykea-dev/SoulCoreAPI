package net.soulteam.soulcore;

import net.md_5.bungee.api.chat.TextComponent;
import net.soulteam.soulcore.bosses.Boss;
import net.soulteam.soulcore.cases.utils.CaseType;
import net.soulteam.soulcore.clans.Clan;
import net.soulteam.soulcore.data.Auction;
import net.soulteam.soulcore.guard.Region;
import net.soulteam.soulcore.utils.enums.Group;
import net.soulteam.soulcore.utils.enums.Version;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public abstract class User {
	final Main plugin = Main.getInstance();
	final String name;

	public User(final String name) {
		this.name = name.toLowerCase();
	}

	@Override
	public String toString() {
		return name;
	}

	public abstract boolean exists();

	public abstract String getName();

	public abstract String getLastMessage();

	public abstract void setLastMessage(final String message);

	public abstract Clan getClan();

	public abstract void setClan(final String clan);

	public abstract boolean isInClan();

	public abstract String getPrefix();

	public abstract void setPrefix(final String prefix);

	public abstract String getIP();

	public abstract void setIP(final String ip);

	public abstract int getLevel();

	public abstract void setLevel(final int lvl);

	public abstract void addLevel(final int lvl);

	public abstract void takeLevel(final int lvl);

	public abstract double getBoost();

	public abstract int getXP();

	public abstract void setXP(final int xp);

	public abstract double getNeedXP(final int lvl);

	public abstract int getRefs();

	public abstract void setRefs(final int count);

	public abstract void addRefs(final int count);

	public abstract void takeRefs(final int count);

	public abstract String getHomes();

	public abstract void setHomes(final String homes);

	public abstract void addXP(final int xp);

	public abstract int getMoney();

	public abstract void setMoney(final double amount);

	public abstract void addMoney(final double amount);

	public abstract boolean hasMoney(final double need);

	public abstract void takeMoney(final double amount);

	public abstract void takeXP(final int xp);

	public abstract boolean isMsgToggle();

	public abstract void setMsgToggle(final boolean value);

	public abstract boolean isTpToggle();

	public abstract void setTpToggle(final boolean value);

	public abstract boolean isGlobalChatEnabled();

	public abstract void setGlobalChatEnabled(final boolean value);

	public abstract boolean isLocalChatEnabled();

	public abstract void setLocalChatEnabled(final boolean value);

	public abstract boolean isClanChatEnabled();

	public abstract void setClanChatEnabled(final boolean value);

	public abstract boolean isShortChatEnabled();

	public abstract void setShortChatEnabled(final boolean value);

	public abstract boolean isOnline();

	public abstract boolean isRefEnabled();

	public abstract void setRefEnabled(final boolean value);

	public abstract boolean isRefOtherEnabled();

	public abstract void setRefOtherEnabled(final boolean value);

	public abstract String getLastTell();

	public abstract void setLastTell(final String player);

	public abstract void setJob(final String job);

	public abstract int getJobLevel();

	public abstract void setJobLevel(final int level);

	public abstract void takeJobLevel(final int level);

	public abstract int getJobXP();

	public abstract void setJobXP(final int xp);

	public abstract void takeJobXP(final int xp);

	public abstract void sendMessage(final String message);

	public abstract void sendMessage(final TextComponent component);

	public abstract Player getPlayer();

	public abstract int getRubles();

	public abstract Region getInRegion();

	public abstract Version getClientVersion();

	public abstract Boss getActiveBoss();

	public abstract void setActiveBoss(final Boss boss);

	public abstract double getBossDamage(final Boss boss);

	public abstract void addRubles(final double rubles);

	public abstract void takeRubles(final double rubles);

	public abstract void addBankMoney(final double money);

	public abstract void takeBankMoney(final double money);

	public abstract int getBankMoney();

	public abstract void sendVersionError(final Version version);

	//public abstract Language getLanguage();

	public abstract boolean isClanOwner(final Clan clan);

	//public abstract void sendMessage(final Message message);

	public abstract Group getGroup();

	public abstract boolean isIgnore(final String name);

	public abstract int getCases(final CaseType type);

	public abstract void giveCases(final CaseType type, final int count);

	public abstract void takeCases(final CaseType type, final int count);

	public abstract Auction getAuction();

	public abstract int getMaxAucItems();
}
