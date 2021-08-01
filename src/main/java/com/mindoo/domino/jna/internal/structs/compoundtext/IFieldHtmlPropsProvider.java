package com.mindoo.domino.jna.internal.structs.compoundtext;

import com.sun.jna.Pointer;

public interface IFieldHtmlPropsProvider {

	Pointer getCDRecordWithHeaderAndFieldStruct();
	
	Pointer getCDRecordWithHeaderAndIDNameStruct();
	
}
