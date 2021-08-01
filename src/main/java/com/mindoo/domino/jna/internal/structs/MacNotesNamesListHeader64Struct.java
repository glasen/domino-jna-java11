package com.mindoo.domino.jna.internal.structs;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.mindoo.domino.jna.internal.structs.BaseStructure;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * JNA class to the NAMES_LIST type on Mac 64 bit platforms
 * 
 * @author Karsten Lehmann
 */
public class MacNotesNamesListHeader64Struct extends BaseStructure {
	/** Number of names in list */
	public short NumNames;

	/**
	 * User's license - now obsolete<br>
	 * C type : LICENSEID
	 */
	
	/**
	 * license number<br>
	 * C type : BYTE[5]
	 */
	public byte[] ID = new byte[5];
	/** product code, mfgr-specific */
	public byte Product;
	/**
	 * validity check field, mfgr-specific<br>
	 * C type : BYTE[2]
	 */
	public byte[] Check = new byte[2];

	/**
	 * Flag to mark the user as already authenticated, e.g. via web server
	 */
	public short Authenticated;
	
	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public MacNotesNamesListHeader64Struct() {
		super();
		setAlignType(ALIGN_NONE);
	}
	
	public static MacNotesNamesListHeader64Struct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<MacNotesNamesListHeader64Struct>() {

			@Override
			public MacNotesNamesListHeader64Struct run() {
				return new MacNotesNamesListHeader64Struct();
			}
		});
	}
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("NumNames", "ID", "Product", "Check", "Authenticated");
	}
	
	/**
	 * Creates a new instance
	 * 
	 * @param numNames number of names in the list
	 * @param id info from LICENSEID, should be empty
	 * @param product info from LICENSEID, should be empty
	 * @param check info from LICENSEID, should be empty
	 * @param authenticated  Flag to mark the user as already authenticated, e.g. via web server
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public MacNotesNamesListHeader64Struct(short numNames, byte id[], byte product, byte check[], short authenticated) {
		super();
		setAlignType(ALIGN_NONE);
		this.NumNames = numNames;
		if ((id.length != this.ID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ID = id;
		this.Product = product;
		if ((check.length != this.Check.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Check = check;
		this.Authenticated = authenticated;
	}
	
	public static MacNotesNamesListHeader64Struct newInstance(final short numNames, final byte id[], final byte product, final byte check[], final short authenticated) {
		return AccessController.doPrivileged(new PrivilegedAction<MacNotesNamesListHeader64Struct>() {

			@Override
			public MacNotesNamesListHeader64Struct run() {
				return new MacNotesNamesListHeader64Struct(numNames, id, product, check, authenticated);
			}
		});
	}
	
	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block

	 * @param peer pointer
	 */
	@Deprecated
	public MacNotesNamesListHeader64Struct(Pointer peer) {
		super(peer);
		setAlignType(ALIGN_NONE);
	}
	
	public static MacNotesNamesListHeader64Struct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<MacNotesNamesListHeader64Struct>() {

			@Override
			public MacNotesNamesListHeader64Struct run() {
				return new MacNotesNamesListHeader64Struct(peer);
			}
		});
	}
	
	public static class ByReference extends MacNotesNamesListHeader64Struct implements Structure.ByReference {
		
	};
	public static class ByValue extends MacNotesNamesListHeader64Struct implements Structure.ByValue {
		
	};
}
