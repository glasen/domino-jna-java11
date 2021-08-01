package com.mindoo.domino.jna.internal.structs.html;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.mindoo.domino.jna.internal.structs.BaseStructure;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class HTMLAPIReference32Struct extends BaseStructure {
	/**
	 * How ref is used in the HTML text (HTMLAPI_REF_xxx - see list above)<br>
	 * C type : HTMLAPI_REF_TYPE
	 */
	public int RefType;
	/**
	 * Reference's NULL-terminated text string<br>
	 * C type : char*
	 */
	public Pointer pRefText;
	/**
	 * A web server command associated with the target URL<br>
	 * C type : CmdId
	 */
	public int CommandId;
	/**
	 * Reference's target components<br>
	 * C type : HTMLAPI_URLComponent*
	 */
	public Pointer pTargets;
	/**
	 * Reference's arguments (eg, &amp;Start=xxx, &amp;Count=xxx, etc).<br>
	 * C type : HTMLAPI_URLComponent*
	 */
	public Pointer pArgs;
	/** Number of components in the target part of the reference (dbname, unid, etc.) */
	public int NumTargets;
	/** Number of components in the args part of the reference (&amp;Start, etc.) */
	public int NumArgs;
	/**
	 * NULL-terminated LMBCS text string -- the fragment part of URL<br>
	 * if there is no fragment, pointer points to "" (i.e. '\0')<br>
	 * C type : char*
	 */
	public Pointer pFragment;
	/**
	 * C trick to align first member of an array of target and arg values<br>
	 * C type : HTMLAPI_URLComponent[1]
	 */
	public HtmlApi_UrlComponentStruct[] URLParts = new HtmlApi_UrlComponentStruct[1];
	
	public HTMLAPIReference32Struct() {
		super();
	}
	
	public static HTMLAPIReference32Struct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<HTMLAPIReference32Struct>() {

			@Override
			public HTMLAPIReference32Struct run() {
				return new HTMLAPIReference32Struct();
			}
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("RefType", "pRefText", "CommandId", "pTargets", "pArgs", "NumTargets", "NumArgs", "pFragment", "URLParts");
	}
	/**
	 * @param RefType How ref is used in the HTML text (HTMLAPI_REF_xxx - see list above)<br>
	 * C type : HTMLAPI_REF_TYPE<br>
	 * @param pRefText Reference's NULL-terminated text string<br>
	 * C type : char*<br>
	 * @param CommandId A web server command associated with the target URL<br>
	 * C type : CmdId<br>
	 * @param pTargets Reference's target components<br>
	 * C type : HTMLAPI_URLComponent*<br>
	 * @param pArgs Reference's arguments (eg, &amp;Start=xxx, &amp;Count=xxx, etc).<br>
	 * C type : HTMLAPI_URLComponent*<br>
	 * @param NumTargets Number of components in the target part of the reference (dbname, unid, etc.)<br>
	 * @param NumArgs Number of components in the args part of the reference (&amp;Start, etc.)<br>
	 * @param pFragment NULL-terminated LMBCS text string -- the fragment part of URL<br>
	 * if there is no fragment, pointer points to "" (i.e. '\0')<br>
	 * C type : char*<br>
	 * @param URLParts C trick to align first member of an array of target and arg values<br>
	 * C type : HTMLAPI_URLComponent[1]
	 */
	public HTMLAPIReference32Struct(int RefType, Pointer pRefText, int CommandId, Pointer pTargets, Pointer pArgs, int NumTargets, int NumArgs, Pointer pFragment, HtmlApi_UrlComponentStruct URLParts[]) {
		super();
		this.RefType = RefType;
		this.pRefText = pRefText;
		this.CommandId = CommandId;
		this.pTargets = pTargets;
		this.pArgs = pArgs;
		this.NumTargets = NumTargets;
		this.NumArgs = NumArgs;
		this.pFragment = pFragment;
		if ((URLParts.length != this.URLParts.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.URLParts = URLParts;
	}
	
	public static HTMLAPIReference32Struct newInstance(final int RefType, final Pointer pRefText, final int CommandId, final Pointer pTargets, final Pointer pArgs, final int NumTargets, final int NumArgs, final Pointer pFragment, final HtmlApi_UrlComponentStruct URLParts[]) {
		return AccessController.doPrivileged(new PrivilegedAction<HTMLAPIReference32Struct>() {

			@Override
			public HTMLAPIReference32Struct run() {
				return new HTMLAPIReference32Struct(RefType, pRefText, CommandId, pTargets, pArgs, NumTargets, NumArgs, pFragment, URLParts);
			}
		});
	}

	
	public HTMLAPIReference32Struct(Pointer peer) {
		super(peer);
	}
	
	public static HTMLAPIReference32Struct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<HTMLAPIReference32Struct>() {

			@Override
			public HTMLAPIReference32Struct run() {
				return new HTMLAPIReference32Struct(peer);
			}
		});
	}

	public static class ByReference extends HTMLAPIReference32Struct implements Structure.ByReference {
		
	};
	public static class ByValue extends HTMLAPIReference32Struct implements Structure.ByValue {
		
	};
}
