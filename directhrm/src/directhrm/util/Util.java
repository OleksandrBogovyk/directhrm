package directhrm.util;

/**
 *
 * @author andre
 */
public class Util {

	public final static StringCyrComparator STRING_CYR_COMPARATOR = 
			new StringCyrComparator();

	public static int parseInt(String value, int defaultValue) {
		try {
			int i = Integer.parseInt(value);
			return i;
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}
	
	public static long parseLong(String value, long defaultValue) {
		try {
			long l = Long.parseLong(value);
			return l;
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}
}
