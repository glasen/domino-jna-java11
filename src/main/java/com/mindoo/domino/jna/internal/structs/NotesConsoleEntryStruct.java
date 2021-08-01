package com.mindoo.domino.jna.internal.structs;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesConsoleEntryStruct extends Structure {
	/** C type : DHANDLE */
	public int nextEntry;
	/** C type : DHANDLE */
	public int prevEntry;
	/** What type of data is this? */
	public short type;
	public short signals;
	public int consoleBufferID;
	/** length of the data */
	public int length;
	
	public NotesConsoleEntryStruct() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("nextEntry", "prevEntry", "type", "signals", "consoleBufferID", "length");
	}

	public NotesConsoleEntryStruct(int nextEntry, int prevEntry, short type, short signals, int consoleBufferID, int length) {
		super();
		this.nextEntry = nextEntry;
		this.prevEntry = prevEntry;
		this.type = type;
		this.signals = signals;
		this.consoleBufferID = consoleBufferID;
		this.length = length;
	}
	
	public NotesConsoleEntryStruct(Pointer peer) {
		super(peer);
	}
	
	public static NotesConsoleEntryStruct newInstance(Pointer p) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesConsoleEntryStruct>() {

			@Override
			public NotesConsoleEntryStruct run() {
				return new NotesConsoleEntryStruct(p);
			}
		});
	}
	
	public static class ByReference extends NotesConsoleEntryStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesConsoleEntryStruct implements Structure.ByValue {
		
	};
}
