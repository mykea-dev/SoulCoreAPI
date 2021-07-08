package net.soulteam.soulcore.guard;

public interface Region {
	boolean find();
	boolean addMember(String nick);
	boolean removeMember(String nick);
	boolean setFlag(String flag, final boolean value);
	boolean setFlag(String flag, final String value);
	int getMin(final String coord);
	int getMax(final String coord);
	String getWorld();
	boolean isFlag(final String flag);
	String getOwner();
	String getMembers();
	boolean isOwner(final String nick);
	boolean isMember(final String nick);
	String getName();
	void remove();
	boolean getFlagValue(final String flag);
}
