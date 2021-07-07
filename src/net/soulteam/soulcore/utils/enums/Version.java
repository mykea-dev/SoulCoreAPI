package net.soulteam.soulcore.utils.enums;

public enum Version {
	UNKNOWN(0, 0, false, "unknown"),
	V1_11(315, 1, false, "1.11"),
	V1_12(340, 2, false, "1.12"),
	V1_13(393, 3, false, "1.13"),
	V1_14(477, 4, false, "1.14"),
	V1_15(573, 5, true, "1.15"),
	V1_16(735, 6, true, "1.16"),
	V1_17(755, 7, true, "1.17");

	final int protocolVersion;
	final int version;
	final boolean full_supported;
	final String name;

	Version(final int protocolVersion, final int version, final boolean full_supported, final String name) {
		this.protocolVersion = protocolVersion;
		this.version = version;
		this.full_supported = full_supported;
		this.name = name;
	}

	public boolean isFullSupported() {
		return full_supported;
	}

	public int getIntVersion() {
		return version;
	}

	public String getStringVersion() {
		return name + ".x";
	}

	public String getStringVersion(final int sub) {
		return name + "." + sub;
	}

	public int getProtocolVersion() {
		return protocolVersion;
	}
}
