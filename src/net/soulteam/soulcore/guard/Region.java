package net.soulteam.soulcore.guard;

public interface Region {
	/**
	 * Find region
	 *
	 * @return true - region found
	 */
	boolean find();

	/**
	 * add member to region
	 *
	 * @param nick member to add
	 * @return true - success
	 */
	boolean addMember(String nick);

	/**
	 * remove member to region
	 *
	 * @param nick member to remove
	 * @return true - success
	 */
	boolean removeMember(String nick);

	/**
	 * set flag to region
	 *
	 * @param flag flag to set
	 * @param value <br>true: allow <br> false: deny
	 * @return true - success
	 */
	boolean setFlag(String flag, final boolean value);

	/**
	 * set flag to region
	 *
	 * @param flag flag to set
	 * @param value <br>allow: true <br> deny: false
	 * @return true - success
	 */
	boolean setFlag(String flag, final String value);

	/**
	 * get minimum coords of region
	 *
	 * @param coord idk
	 * @return coords
	 */
	int getMin(final String coord);

	/**
	 * get maximum coords of region
	 *
	 * @param coord idk
	 * @return coords
	 */
	int getMax(final String coord);

	/**
	 * get region world
	 *
	 * @return world name
	 */
	String getWorld();

	/**
	 * check is flag string
	 *
	 * @param flag string for check
	 * @return true - is flag
	 */
	boolean isFlag(final String flag);

	/**
	 * get region owner
	 *
	 * @return owner name
	 */
	String getOwner();

	/**
	 * get region members
	 *
	 * @return region members
	 */
	String getMembers();

	/**
	 * check is owner player of the region
	 *
	 * @param nick player nick for check
	 * @return true - player owner
	 */
	boolean isOwner(final String nick);

	/**
	 * check is member player of the region
	 *
	 * @param nick player nick for check
	 * @return true - player member
	 */
	boolean isMember(final String nick);

	/**
	 * get region name
	 *
	 * @return region name
	 */
	String getName();

	/**
	 * delete the region
	 */
	void remove();

	/**
	 * get flag value of the region
	 *
	 * @param flag flag to ged
	 * @return true - flag: allow
	 */
	boolean getFlagValue(final String flag);
}
