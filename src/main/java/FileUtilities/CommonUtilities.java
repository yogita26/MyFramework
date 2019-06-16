package FileUtilities;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

import Keywords_base.Constants_Class;


public class CommonUtilities {
	public static String[]splitLocator(String value)
	{
		String[]parts;
		parts=value.split(Constants_Class.doublehash);
		return parts;
		
	}


}
