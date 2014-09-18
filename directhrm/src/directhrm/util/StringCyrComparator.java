package directhrm.util;

/**
 *
 * @author andre
 */
import java.util.Comparator;

public class StringCyrComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if( s1 == null && s2 == null )
			return 0;
		if( s1 == null )
			return -1;
		if( s2 == null )
			return 1;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int len = Math.min(s1.length(), s2.length());
		for(int i = 0; i < len; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if( c1 == c2 )
				continue;
			return compareChar(c1, c2);
		}
		
		if( s1.length() == s2.length() )
			return 0;
		return s1.length() < s2.length() ? -1 : 1;
	}

	private int compareChar(char c1, char c2) {
		if( c1 == c2 )
			return 0;
		int i1 = ALPHA.indexOf(c1);
		int i2 = ALPHA.indexOf(c2);
		if( i1 == -1 || i2 == -1 )
			return c1 - c2;
		return i1 - i2;
	}

	private final static String ALPHA = "абвгґдеєёжзіиїйклмнопрстуфхцчшщьыъэюя";
}
