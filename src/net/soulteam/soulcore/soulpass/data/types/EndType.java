package net.soulteam.soulcore.soulpass.data.types;

public enum EndType {
	DEBUG("debug", "§eDEBUG", 552424245),
	EASY("day", "§cраз в день", 86400000),
	MIDDLE("week", "§cраз в неделю", 604800000);

	final String type;
	final String displayType;
	final int ms;

	EndType(final String type, final String displayType, final int ms) {
		this.type = type;
		this.ms = ms;
		this.displayType = displayType;
	}

	public final String getType() {
		return type;
	}

	public final String getDisplayType() {
		return displayType;
	}

	public final int getMs() {
		return ms;
	}
}
