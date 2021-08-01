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
public class NotesCalendarActionDataStruct extends Structure {
	/** MUST be sizeof(EXT_CALACTION_DATA) - allows for safe expansion of struct in the future */
	public short wLen;
	/**
	 * Required for dwAction: CAL_PROCESS_DELEGATE - disregarded otherwise<br>
	 * C type : char*
	 */
	public Pointer pszDelegateTo;
	/**
	 * Desired new start date/time.  Required for dwAction: CAL_PROCESS_COUNTER - disregarded otherwise<br>
	 * C type : TIMEDATE*
	 */
	public Pointer ptdChangeToStart;
	/**
	 * Desired new end date/time.  Required for dwAction: CAL_PROCESS_COUNTER - disregarded otherwise<br>
	 * C type : TIMEDATE*
	 */
	public Pointer ptdChangeToEnd;
	/**
	 * If populated for CAL_PROCESS_DELEGATE or CAL_PROCESS_DECLINE, used to inform the Chair if<br>
	 * C type : BOOL*
	 */
	public Pointer pfKeepInformed;
	/**
	 * RESERVED - MUST be NULL<br>
	 * C type : void*
	 */
	public Pointer pReserved;
	/**
	 * List of users to add to the specified entry (or entries) as a Required attendee.<br>
	 * C type : LIST*
	 */
	public Pointer pAddNamesReq;
	/**
	 * List of users to add to the specified entry (or entries) as an Optional attendee.<br>
	 * C type : LIST*
	 */
	public Pointer pAddNamesOpt;
	/**
	 * List of users to add to the specified entry (or entries) as an FYI attendee.<br>
	 * C type : LIST*
	 */
	public Pointer pAddNamesFYI;
	/**
	 * List of users to remove from the specified entry (or entries).<br>
	 * C type : LIST*
	 */
	public Pointer pRemoveNames;
	
	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public NotesCalendarActionDataStruct() {
		super();
//		setAlignType(ALIGN_NONE);
		this.wLen = (short) (size() & 0xffff);
	}
	
	public static NotesCalendarActionDataStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesCalendarActionDataStruct>() {

			@Override
			public NotesCalendarActionDataStruct run() {
				return new NotesCalendarActionDataStruct();
			}
		});
	}
	
	protected List<String> getFieldOrder() {
		return Arrays.asList("wLen", "pszDelegateTo", "ptdChangeToStart", "ptdChangeToEnd", "pfKeepInformed", "pReserved", "pAddNamesReq", "pAddNamesOpt", "pAddNamesFYI", "pRemoveNames");
	}
	
	/**
	 * 
	 * @param peer pointer
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public NotesCalendarActionDataStruct(Pointer peer) {
		super(peer);
//		setAlignType(ALIGN_NONE);
		this.wLen = (short) (size() & 0xffff);
	}
	
	public static NotesCalendarActionDataStruct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesCalendarActionDataStruct>() {

			@Override
			public NotesCalendarActionDataStruct run() {
				return new NotesCalendarActionDataStruct(peer);
			}
		});
	}
	
	public static class ByReference extends NotesCalendarActionDataStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesCalendarActionDataStruct implements Structure.ByValue {
		public static NotesCalendarActionDataStruct.ByValue newInstance() {
			return AccessController.doPrivileged(new PrivilegedAction<NotesCalendarActionDataStruct.ByValue>() {

				@Override
				public NotesCalendarActionDataStruct.ByValue run() {
					return new NotesCalendarActionDataStruct.ByValue();
				}
			});
		}
	};
}
