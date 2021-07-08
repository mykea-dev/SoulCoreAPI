package net.soulteam.soulcore.soulpass.data.types;

public enum QuestType {
	NULL("NULL"), MOB("MOB"), ITEM("ITEM"), BREAK("BREAK");

	final String type;

	QuestType(final String type) {
		this.type = type;
	}

	public String getStringType() {
		return type;
	}

	@Override
	public String toString() {
		return type;
	}
}
