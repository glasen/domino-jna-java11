package com.mindoo.domino.jna.constants;

/**
 * Constants to read platform directories
 */
public enum OSDirectory {
	/** Directory of Domino executable */
	EXECUTABLE,
	/** Domino data directory */
	DATA,
	/** Domino temp directory */
	TEMP,
//	/** DAOS Base directory */
// commented out, not compatible with later Notes version
//	DAOS,
	/** Temporary folder used for view rebuilds */
	VIEWREBUILD
}