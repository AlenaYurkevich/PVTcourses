package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5_3 {

	// any 4 symbols
	public static boolean test5_3(String testString) {
		Pattern p = Pattern.compile(".{4}");
		Matcher m = p.matcher(testString);
		return m.matches();
	}

}