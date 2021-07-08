package net.soulteam.soulcore.utils.enums;

public enum Group {
	DEFAULT("", "", ""),
	SILVER("", "", ""),
	MAG("", "", ""),
	GOD("", "", ""),
	TITAN("", "", ""),
	ELITE("", "", ""),
	ULTRA("", "", ""),
	KING("", "", ""),
	YT("", "", ""),
	HELPER("", "", ""),
	LOOKING("", "", ""),
	MODER("", "", ""),
	MODER2("", "", ""),
	ADMIN("", "", "");

	final String name;
	final String permission;
	final String prefix;

	Group(final String name, final String permission, final String prefix) {
		this.name = name;
		this.permission = permission;
		this.prefix = prefix;
	}

	public String getName() {
		return name;
	}

	public String getPermission() {
		return permission;
	}

	public String getPrefix() {
		return prefix;
	}
}
