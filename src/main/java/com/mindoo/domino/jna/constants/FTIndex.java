package com.mindoo.domino.jna.constants;

import java.util.EnumSet;

/**
 * These values define the options used when creating a full text
 * index for a database.<br>
 * These options may be combined as an {@link EnumSet}.<br>
 * However, {@link #AUTOOPTIONS} will ignore all other indexing
 * options and therefore should not be OR-ed with any of the other
 * indexing options.
 * 
 * @author Karsten Lehmann
 */
public enum FTIndex {
	/** Forces re-indexing the database from scratch. This option is useful if the indexing
	 * options for the database are being changed. */
	REINDEX(0x0002),
	/** Build case sensitive index */
	CASE_SENS(0x0004),
	/** Build an index that includes word variants (stems). This allows searching to include word variants.
	 * A full text search index built with the Notes user interface, is automatically stemmed. */
	STEM_INDEX(0x0008),
	/** Build index with word, sentence, and paragraph index break option which allows a search for
	 * words within a sentence or paragraph. */
	PSW(0x0010),
	/** Optimize index (e.g. for CDROM) (Not used) */
	OPTIMIZE(0x0020),
	/** Index Attachments */
	ATT(0x0040),
	/** Index Encrypted Fields */
	ENCRYPTED_FIELDS(0x0080),
	/** Use the index options that are in database. If the database has never been indexed, use the
	 * default indexing options. Database indexing options include the Stop Word File name, case
	 * sensitivity, the PSW option, reindexing, and the stem index. Note that the stem index will
	 * be set if FT_INDEX_AUTOOPTIONS is used. */
	AUTOOPTIONS(0x0100),
	/** Index summary data only */
	SUMMARY_ONLY(0x0200),
	/** Index all attachments including BINARY formats */
	ATT_BINARY(0x1000);

	private int m_val;
	
	FTIndex(int val) {
		m_val = val;
	}
	
	public int getValue() {
		return m_val;
	}
	
	public static short toBitMask(EnumSet<FTIndex> optionSet) {
		int result = 0;
		if (optionSet!=null) {
			for (FTIndex currFind : values()) {
				if (optionSet.contains(currFind)) {
					result = result | currFind.getValue();
				}
			}
		}
		return (short) (result & 0xffff);
	}
}
