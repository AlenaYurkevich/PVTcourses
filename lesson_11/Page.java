package core;

import java.util.*;

public class Page {

	float id;
	String title;
	ArrayList<Button> buttons = new ArrayList<Button>();
	LinkedList<Field> fields = new LinkedList<Field>();
	HashSet<Label> labels = new HashSet<Label>();
	HashMap<Integer, Dropdown> dropdowns = new HashMap<Integer, Dropdown>();

	public Page(float id, String title) {
		this.id = id;
		this.title = title;
	}

	// for ArrayList<Button> buttons

	public ArrayList<Button> getButtons() { // getter
		return buttons;
	}

	public void setButtons(ArrayList<Button> buttons) { // setter
		this.buttons = buttons;
	}

	public void addToArrayList(Button button) {
		this.buttons.add(button);
	}

	public void removeFromArrayList(Button button) {
		this.buttons.remove(button);
	}

	public void replaceButton(int a, Button button) {
		this.buttons.set(a, button);
	}

	public void printCollectionButtons() {
		for (Button element : this.buttons) { // via For each cycle
			System.out.println(element.toString());
		}
	}

	// for LinkedList<Field> fields

	public LinkedList<Field> getFields() {
		return fields;
	}

	public void setButtons(LinkedList<Field> field) {
		this.fields = field;
	}

	public void addToLinkedList(Field field) {
		this.fields.add(field);
	}

	public void removeFromLinkedList(Field field) {
		this.fields.remove(field);
	}

	public void replaceField(int a, Field field) {
		this.fields.set(a, field);
	}

	public void printCollectionFields() {
		for (Field element : this.fields) { // via For each cycle
			System.out.println(element.toString());
		}
	}

	// for HashSet<Label> labels

	public HashSet<Label> getLabels() {
		return labels;
	}

	public void setLabels(HashSet<Label> label) {
		this.labels = label;
	}

	public void addToHashSet(Label label) {
		this.labels.add(label);
	}

	public void removeFromHashSet(Label label) {
		this.labels.remove(label);
	}

	public void replaceLabel(Label a, Label label) {
		if (labels.contains(a)) {
			labels.remove(a);
			labels.add(label);
		}
	}

	public void printCollectionLabels() {
		Iterator<Label> iter = labels.iterator(); // via Iterator
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}

	// for HashMap<String, Dropdown> dropdowns

	public HashMap<Integer, Dropdown> getDropdowns() {
		return dropdowns;
	}

	public void setDropdowns(HashMap<Integer, Dropdown> dropdown) {
		this.dropdowns = dropdown;
	}

	public void addToHashMap(Integer key, Dropdown dropdown) {
		this.dropdowns.put(key, dropdown);
	}

	public void removeFromHashMap(Integer key, Dropdown dropdown) {
		dropdowns.remove(key, dropdown);
	}

	public void replaceDropdown(Integer key, Dropdown dropdown) {
		if (dropdowns.containsKey(key)) {
			dropdowns.replace(key, dropdown);
		}
	}

	public void printHashMapDropdowns() {
		Set<Map.Entry<Integer, Dropdown>> set = dropdowns.entrySet();
		for (Map.Entry<Integer, Dropdown> dr : set) {
			System.out.println("Key: " + dr.getKey() + "  Value: " + dr.getValue().toString());
		}
	}

}
