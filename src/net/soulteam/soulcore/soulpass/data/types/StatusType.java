package net.soulteam.soulcore.soulpass.data.types;

public enum StatusType {
	ACTIVE(""),
	END(""),
	NOT_ACTIVE(""),
	NOT_TAKE("");

	final String display;

	StatusType(final String display) {
		this.display = display;
	}
}
