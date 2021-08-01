package com.mindoo.domino.jna;

import java.util.Calendar;
import java.util.List;

public interface INoteSummary {

	/**
	 * Convenience function that converts a summary value to a string
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if value is empty or is not a string
	 * @return string value or null
	 */
	String getAsString(String itemName, String defaultValue);
	
	/**
	 * Convenience function that converts a summary value to an abbreviated name
	 * 
	 * @param itemName item name, case insensitive
	 * @return name or null
	 */
	String getAsNameAbbreviated(String itemName);
	
	/**
	 * Convenience function that converts a summary value to an abbreviated name
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue value to be used of item not found
	 * @return name or default value
	 */
	String getAsNameAbbreviated(String itemName, String defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a list of abbreviated names
	 * 
	 * @param itemName item name, case insensitive
	 * @return names or null
	 */
	List<String> getAsNamesListAbbreviated(String itemName);
	
	/**
	 * Convenience function that converts a summary value to a list of abbreviated names
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a string or string list
	 * @return names or default value if not found
	 */
	List<String> getAsNamesListAbbreviated(String itemName, List<String> defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a string list
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a string or string list
	 * @return string list value or null
	 */
	List<String> getAsStringList(String itemName, List<String> defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a {@link Calendar}
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a Calendar
	 * @return calendar value or null
	 */
	Calendar getAsCalendar(String itemName, Calendar defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a {@link NotesTimeDate}
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a NotesTimeDate
	 * @return NotesTimeDate value or null
	 */
	NotesTimeDate getAsTimeDate(String itemName, NotesTimeDate defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a {@link Calendar} list
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a Calendar
	 * @return calendar list value or null
	 */
	List<Calendar> getAsCalendarList(String itemName, List<Calendar> defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a {@link NotesTimeDate} list
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a NotesTimeDate list
	 * @return NotesTimeDate list value or null
	 */
	List<NotesTimeDate> getAsTimeDateList(String itemName, List<NotesTimeDate> defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a double
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a number
	 * @return double
	 */
	Double getAsDouble(String itemName, Double defaultValue);
	
	/**
	 * Convenience function that converts a summary value to an integer
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a number
	 * @return integer
	 */
	Integer getAsInteger(String itemName, Integer defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a double list
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a number
	 * @return double list
	 */
	List<Double> getAsDoubleList(String itemName, List<Double> defaultValue);
	
	/**
	 * Convenience function that converts a summary value to an integer list
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a number
	 * @return integer list
	 */
	List<Integer> getAsIntegerList(String itemName, List<Integer> defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a long value
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a number
	 * @return long
	 */
	Long getAsLong(String itemName, Long defaultValue);
	
	/**
	 * Convenience function that converts a summary value to a list of long values
	 * 
	 * @param itemName item name, case insensitive
	 * @param defaultValue default value if column is empty or is not a number
	 * @return long list
	 */
	List<Long> getAsLongList(String itemName, List<Long> defaultValue);
	
}
