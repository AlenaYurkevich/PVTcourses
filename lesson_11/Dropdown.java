package core;

import java.util.List;

public class Dropdown {
	boolean isSelected;
	String name;
	List<String> options;

	public Dropdown(boolean isSelected, String name, List<String> options) {
		this.isSelected = isSelected;
		this.name = name;
		this.options = options;

	}

	public String toString() {
		String string = "";
		for (String s : options) {
			string = string + " " + s;
		}
		return "{" + string + " } " + this.isSelected + " " + this.name;
	}

}
