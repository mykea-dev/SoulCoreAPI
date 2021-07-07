package net.soulteam.soulcore.utils.enums;

public enum Group {
	DEFAULT("default", "group.default", "§7[Игрок]"),
	SILVER("silver", "group.silver", "§7[§f§lSILVER§7]"),
	MAG("mag", "group.mag", "§7[§9§lMAG§7]"),
	GOD("god", "group.god", "§7[§6§lGOD§7]"),
	TITAN("titan", "group.titan", "§7[§d§lTITAN§7]"),
	ELITE("elite", "group.elite", "§7[§a§lELITE§7]"),
	ULTRA("ultra", "group.ultra", "§7[§5§lULTRA§7]"),
	KING("king", "group.king", "§7[§b§lKING§7]"),
	YT("yt", "group.yt", "§7[§4§lY§f§lT§7]"),
	HELPER("helper", "group.helper", "§7[§2§lHELPER§7]"),
	LOOKING("looking", "group.looking", "§7[§c§lLOOKING§7]"),
	MODER("moder", "group.moder", "§7[§3§lMODER§7]"),
	MODER2("moder2", "group.moder2", "§7[§3§lSt.Moder§7]"),
	ADMIN("admin", "group.admin", "§7[§4§lADMIN§7]");

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
