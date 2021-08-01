package com.mindoo.domino.jna.internal;

import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.ptr.IntByReference;

public interface INotesNativeAPI32V1000 extends Library {

	@UndocumentedAPI
	short NSFQueryDB(int hDb, Memory query, int flags,
			int maxDocsScanned, int maxEntriesScanned, int maxMsecs,
			IntByReference retResults, IntByReference retError, IntByReference retExplain);

	@UndocumentedAPI
	short NSFGetSoftDeletedViewFilter(int hViewDB, int hDataDB, int viewNoteID, IntByReference hFilter);

	@UndocumentedAPI
	short NSFDbLargeSummaryEnabled(int hDB);

	@UndocumentedAPI
	short NSFDesignHarvest (int hDB, int flags);

}
