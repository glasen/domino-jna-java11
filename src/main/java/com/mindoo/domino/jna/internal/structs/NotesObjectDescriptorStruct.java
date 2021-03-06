package com.mindoo.domino.jna.internal.structs;
import com.mindoo.domino.jna.internal.structs.BaseStructure;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesObjectDescriptorStruct extends BaseStructure {
	/** Type of object (OBJECT_xxx) */
	public short ObjectType;
	/** Object ID of the object in THIS FILE */
	public int RRV;
	
	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public NotesObjectDescriptorStruct() {
		super();
		setAlignType(Structure.ALIGN_NONE);
	}
	
	public static NotesObjectDescriptorStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesObjectDescriptorStruct>() {

			@Override
			public NotesObjectDescriptorStruct run() {
				return new NotesObjectDescriptorStruct();
			}});
	}
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("ObjectType", "RRV");
	}
	
	/**
	 * @param ObjectType Type of object (OBJECT_xxx)<br>
	 * @param RRV Object ID of the object in THIS FILE
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public NotesObjectDescriptorStruct(short ObjectType, int RRV) {
		super();
		setAlignType(Structure.ALIGN_NONE);
		this.ObjectType = ObjectType;
		this.RRV = RRV;
	}
	
	public static NotesObjectDescriptorStruct newInstance(final short ObjectType, final int RRV) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesObjectDescriptorStruct>() {

			@Override
			public NotesObjectDescriptorStruct run() {
				return new NotesObjectDescriptorStruct(ObjectType, RRV);
			}});
	}
	
	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 * 
	 * @param peer pointer
	 */
	@Deprecated
	public NotesObjectDescriptorStruct(Pointer peer) {
		super(peer);
		setAlignType(Structure.ALIGN_NONE);
	}
	
	public static NotesObjectDescriptorStruct newInstance(final Pointer p) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesObjectDescriptorStruct>() {

			@Override
			public NotesObjectDescriptorStruct run() {
				return new NotesObjectDescriptorStruct(p);
			}});
	}
	
	public static class ByReference extends NotesObjectDescriptorStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesObjectDescriptorStruct implements Structure.ByValue {
		
	};
}
