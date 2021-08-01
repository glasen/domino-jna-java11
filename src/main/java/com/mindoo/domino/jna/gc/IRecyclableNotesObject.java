package com.mindoo.domino.jna.gc;

/**
 * Interface of C API objects that require manual releasing of their handle
 * 
 * @author Karsten Lehmann
 */
public interface IRecyclableNotesObject {

	/**
	 * Recycles the object, if not already done
	 */
	void recycle();
	
	/**
	 * Checks if this object has already been recycled
	 * 
	 * @return true if recycled
	 */
	boolean isRecycled();

	/**
	 * Returns true if the object should not be auto recycled
	 * 
	 * @return true to skip auto gc
	 */
	boolean isNoRecycle();

	/**
	 * Returns the main object handle for 32 bit, used to hash the object
	 * 
	 * @return handle
	 */
	int getHandle32();

	/**
	 * Returns the main object handle for 64 bit, used to hash the object
	 * 
	 * @return handle
	 */
	long getHandle64();
}
