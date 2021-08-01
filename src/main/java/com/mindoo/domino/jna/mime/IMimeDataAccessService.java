package com.mindoo.domino.jna.mime;

import com.mindoo.domino.jna.NotesNote;

public interface IMimeDataAccessService {

	/**
	 * If there are multiple service implementations, order them by ascending
	 * priority and pick the one with the lowest value.
	 * 
	 * @return priority
	 */
	int getPriority();
	
	/**
	 * Reads {@link MIMEData} from a note
	 * 
	 * @param note note
	 * @param itemName MIME item name
	 * @return MIME data or null if item could not be found
	 */
	MIMEData getMimeData(NotesNote note, String itemName);
	
	/**
	 * Writes {@link MIMEData} to a note
	 * 
	 * @param note note
	 * @param itemName MIME item name
	 * @param mimeData MIME data to write
	 */
	void setMimeData(NotesNote note, String itemName, MIMEData mimeData);
	
}
