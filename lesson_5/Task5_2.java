package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5_2 {

	public static boolean test1(String testString) {
		Pattern p = Pattern.compile("[a-zA-Z]{0,4}");
		Matcher m = p.matcher(testString);
		return m.matches();
	}

}