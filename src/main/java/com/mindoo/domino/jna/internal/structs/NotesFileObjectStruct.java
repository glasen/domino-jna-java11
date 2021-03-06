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
public class NotesFileObjectStruct extends BaseStructure {
	/**
	 * object header<br>
	 * C type : OBJECT_DESCRIPTOR
	 */
	public NotesObjectDescriptorStruct Header;
	/** length of file name */
	public short FileNameLength;
	/** text delimiters (HOST_xxx) */
	public short HostType;
	/** compression used (COMPRESS_xxx) */
	public short CompressionType;
	/** orig. file attribs (ATTRIB_xxx) */
	public short FileAttributes;
	/** misc. flags (FILEFLAG_xxx) */
	public short Flags;
	/** orig. file size */
	public int FileSize;
	/**
	 * orig. file date/time of creation<br>
	 * C type : TIMEDATE
	 */
	public NotesTimeDateStruct FileCreated;
	/**
	 * orig. file date/time of mod.<br>
	 * C type : TIMEDATE
	 */
	public NotesTimeDateStruct FileModified;

	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public NotesFileObjectStruct() {
		super();
		setAlignType(Structure.ALIGN_NONE);
	}
	
	public static NotesFileObjectStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesFileObjectStruct>() {

			@Override
			public NotesFileObjectStruct run() {
				return new NotesFileObjectStruct();
			}
		});
	}
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("Header", "FileNameLength", "HostType", "CompressionType", "FileAttributes", "Flags", "FileSize", "FileCreated", "FileModified");
	}
	
	/**
	 * @param Header object header<br>
	 * C type : OBJECT_DESCRIPTOR<br>
	 * @param FileNameLength length of file name<br>
	 * @param HostType text delimiters (HOST_xxx)<br>
	 * @param CompressionType compression used (COMPRESS_xxx)<br>
	 * @param FileAttributes orig. file attribs (ATTRIB_xxx)<br>
	 * @param Flags misc. flags (FILEFLAG_xxx)<br>
	 * @param FileSize orig. file size<br>
	 * @param FileCreated orig. file date/time of creation<br>
	 * C type : TIMEDATE<br>
	 * @param FileModified orig. file date/time of mod.<br>
	 * C type : TIMEDATE
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public NotesFileObjectStruct(NotesObjectDescriptorStruct Header, short FileNameLength, short HostType, short CompressionType, short FileAttributes, short Flags, int FileSize, NotesTimeDateStruct FileCreated, NotesTimeDateStruct FileModified) {
		super();
		setAlignType(Structure.ALIGN_NONE);
		this.Header = Header;
		this.FileNameLength = FileNameLength;
		this.HostType = HostType;
		this.CompressionType = CompressionType;
		this.FileAttributes = FileAttributes;
		this.Flags = Flags;
		this.FileSize = FileSize;
		this.FileCreated = FileCreated;
		this.FileModified = FileModified;
	}

	public static NotesFileObjectStruct newInstance(final NotesObjectDescriptorStruct Header, final short FileNameLength, final short HostType, final short CompressionType, final short FileAttributes, final short Flags, final int FileSize, final NotesTimeDateStruct FileCreated, final NotesTimeDateStruct FileModified) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesFileObjectStruct>() {

			@Override
			public NotesFileObjectStruct run() {
				return new NotesFileObjectStruct(Header, FileNameLength, HostType, CompressionType, FileAttributes, Flags, FileSize, FileCreated, FileModified);
			}
		});
	}

	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 * 
	 * @param peer pointer
	 */
	@Deprecated
	public NotesFileObjectStruct(Pointer peer) {
		super(peer);
		setAlignType(Structure.ALIGN_NONE);
	}
	
	public static NotesFileObjectStruct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesFileObjectStruct>() {

			@Override
			public NotesFileObjectStruct run() {
				return new NotesFileObjectStruct(peer);
			}
		});
	}
	
	public static class ByReference extends NotesFileObjectStruct implements Structure.ByReference {

	};
	
	public static class ByValue extends NotesFileObjectStruct implements Structure.ByValue {

	};
}
