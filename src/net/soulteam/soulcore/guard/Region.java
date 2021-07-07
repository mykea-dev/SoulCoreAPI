package net.soulteam.soulcore.guard;

public abstract class Region {

	public abstract boolean find();

	public abstract boolean addMember(String nick);

	public abstract boolean removeMember(String nick);

	public abstract boolean setFlag(String flag, final boolean value);

	public abstract boolean setFlag(String flag, final String value);

	public abstract int getMin(final String coord);

	public abstract int getMax(final String coord);

	public abstract String getWorld();

	public abstract boolean isFlag(final String flag);

	public abstract String getOwner();

	public abstract String getMembers();

	public abstract boolean isOwner(final String nick);

	public abstract boolean isMember(final String nick);

	public abstract String getName();

	public abstract void remove();

	public abstract boolean getFlagValue(final String flag);
}
