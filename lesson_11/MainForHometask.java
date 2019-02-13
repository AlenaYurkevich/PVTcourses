package core;

import java.util.Arrays;
import java.util.List;

public class MainForHometask {

	public static void main(String[] args) {

		Button confirmButton = new Button("Confirm", "to confirm an action");
		Button cancelButton = new Button("Cancel", "to cancel an action");
		Button test = new Button("Test", "to test");

		Page page = new Page(3.1f, "Payment");
		page.addToArrayList(confirmButton);
		page.addToArrayList(cancelButton);
		page.printCollectionButtons();

		page.replaceButton(0, test);
		page.printCollectionButtons();

		page.removeFromArrayList(cancelButton);
		page.printCollectionButtons();

		System.out.println("");

		Field email = new Field(1, "email");
		Field telephoneNumber = new Field(2, "telephone number");
		Field testF = new Field(3, "test");
		page.addToLinkedList(email);
		page.addToLinkedList(telephoneNumber);
		page.printCollectionFields();

		page.replaceField(1, testF);
		page.printCollectionFields();

		page.removeFromLinkedList(email);
		page.printCollectionFields();

		System.out.println("");

		Label hint = new Label("hint for button");
		Label popup = new Label("error popup");
		Label testL = new Label("label for testing");
		page.addToHashSet(hint);
		page.addToHashSet(popup);
		page.printCollectionLabels();

		page.replaceLabel(hint, testL);
		page.printCollectionLabels();

		page.removeFromHashSet(popup);
		page.printCollectionLabels();

		System.out.println("");

		List<String> countries = Arrays.asList("USA", "Canada", "Mexico");
		List<String> paymentTypes = Arrays.asList("Card", "Cash", "Invoice");
		List<String> documents = Arrays.asList("passport", "id");

		Dropdown countriesDropdown = new Dropdown(true, "Countries", countries);
		Dropdown paymentDropdown = new Dropdown(false, "Payment options", paymentTypes);
		Dropdown documentsDropdown = new Dropdown(true, "Documents", documents);
		page.addToHashMap(1, countriesDropdown);
		page.addToHashMap(2, countriesDropdown);
		page.addToHashMap(3, paymentDropdown);
		page.addToHashMap(4, paymentDropdown);
		page.printHashMapDropdowns();

		page.removeFromHashMap(2, countriesDropdown);
		page.printHashMapDropdowns();

		page.replaceDropdown(4, documentsDropdown);
		page.printHashMapDropdowns();

	}

}
