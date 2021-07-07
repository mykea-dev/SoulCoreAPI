package net.soulteam.soulcore.cases.utils;

public enum CaseType {
	DONATE("donate"),
	MONEY("money"),
	PREFIX("prefix"),
	RUNES("runes"),
	RARE_RUNES("rare_runes");

	final String name;

	CaseType(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
