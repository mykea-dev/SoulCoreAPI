package net.soulteam.soulcore.clans;

import net.soulteam.soulcore.User;

public abstract class Clan {
	public static Clan getClanByTag(final String tag) { return null; }

	public static boolean isExistByName(final String name) { return false; }

	public static boolean isExistByTag(final String tag) { return false; }

	public abstract String getName();

	public abstract String getTag();

	public abstract void setTag(final String value);

	public abstract String getDisplayTag();

	public abstract String getChatClanMessagePrefix();

	public abstract String getUsers();

	public abstract void setUsers(final String value);

	public abstract String getModerators();

	public abstract void setModerators(final String value);

	public abstract String getHome();

	public abstract void setHome(final String value);

	public abstract int getLevel();

	public abstract void setLevel(final int value);

	public abstract int getXP();

	public abstract void setXP(final double value);

	public abstract int getMoney();

	public abstract void setMoney(final int value);

	public abstract User getOwner();

	public abstract void setOwner(final String value);

	public abstract boolean isExist();

	public abstract void kick(final User user);

	public abstract void addParticipationInTheEvent();

	public abstract boolean isParticipation();

	public abstract void addDone(final int count);

	public abstract double getBooster();
}
