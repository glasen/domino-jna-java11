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
public class NotesSchedDetailEntryStruct extends BaseStructure {
	/**
	 * Length of THIS prefix entry, in case it<br>
	 * ever grows, so that new items can be <br>
	 * easily skipped
	 */
	public short wPrefixLen;
	/**
	 * Length of THIS entire entry and ALL of <br>
	 * its related data.
	 */
	public short wEntryLen;
	/**
	 * UNID of the entry this is details of<br>
	 * C type : UNID
	 */
	public NotesUniversalNoteIdStruct Unid;
	/** Offset from entry start to actual data */
	public short wOffsetDetails;
	/** SCHED_DETAIL_ENTRY_ATTR_xxx attributes (TBD) */
	public byte Attr;
	/** Reserved space/padding for ODS */
	public byte bReserved;
	
	public NotesSchedDetailEntryStruct() {
		super();
	}
	
	public static NotesSchedDetailEntryStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesSchedDetailEntryStruct>() {

			@Override
			public NotesSchedDetailEntryStruct run() {
				return new NotesSchedDetailEntryStruct();
			}
		});
	}
	
	protected List<String> getFieldOrder() {
		return Arrays.asList("wPrefixLen", "wEntryLen", "Unid", "wOffsetDetails", "Attr", "bReserved");
	}
	
	/**
	 * @param wPrefixLen Length of THIS prefix entry, in case it<br>
	 * ever grows, so that new items can be <br>
	 * easily skipped<br>
	 * @param wEntryLen Length of THIS entire entry and ALL of <br>
	 * its related data.<br>
	 * @param Unid UNID of the entry this is details of<br>
	 * C type : UNID<br>
	 * @param wOffsetDetails Offset from entry start to actual data<br>
	 * @param Attr SCHED_DETAIL_ENTRY_ATTR_xxx attributes (TBD)<br>
	 * @param bReserved Reserved space/padding for ODS
	 */
	public NotesSchedDetailEntryStruct(short wPrefixLen, short wEntryLen, NotesUniversalNoteIdStruct Unid, short wOffsetDetails, byte Attr, byte bReserved) {
		super();
		this.wPrefixLen = wPrefixLen;
		this.wEntryLen = wEntryLen;
		this.Unid = Unid;
		this.wOffsetDetails = wOffsetDetails;
		this.Attr = Attr;
		this.bReserved = bReserved;
	}
	
	public static NotesSchedDetailEntryStruct newInstance(final short wPrefixLen, final short wEntryLen,
			final NotesUniversalNoteIdStruct Unid, final short wOffsetDetails,
			final byte Attr, final byte bReserved) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesSchedDetailEntryStruct>() {

			@Override
			public NotesSchedDetailEntryStruct run() {
				return new NotesSchedDetailEntryStruct(wPrefixLen, wEntryLen, Unid,
						wOffsetDetails, Attr, bReserved);
			}
		});
	}

	public NotesSchedDetailEntryStruct(Pointer peer) {
		super(peer);
	}
	
	public static NotesSchedDetailEntryStruct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesSchedDetailEntryStruct>() {

			@Override
			public NotesSchedDetailEntryStruct run() {
				return new NotesSchedDetailEntryStruct(peer);
			}
		});
	}
	
	public static class ByReference extends NotesSchedDetailEntryStruct implements Structure.ByReference {
		
	};
	
	public static class ByValue extends NotesSchedDetailEntryStruct implements Structure.ByValue {
		
	};
}
