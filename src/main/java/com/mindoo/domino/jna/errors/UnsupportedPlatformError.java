package com.mindoo.domino.jna.errors;

/**
 * The exception is thrown when the API is about to be used
 * on an unsupported platform.
 * 
 * @author Karsten Lehmann
 */
public class UnsupportedPlatformError extends NotesError {
	private static final long serialVersionUID = 3855708047676206228L;

	public UnsupportedPlatformError(String msg) {
		super(0, msg);
	}
	
}
