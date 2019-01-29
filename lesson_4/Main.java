package core;

public class Main {

	public static void main(String[] args) {

		Person person = new Person();

		person.setName("Vasia");
		System.out.println(person.getName());

		person.setSurname("Pupkin");
		System.out.println(person.getSurname());

		person.setAge(17);
		System.out.println(person.getAge());

		person.setPhone("80295008877");
		System.out.println(person.getPhone());

		person.printAllInformation();
		System.out.println();

		person.printName();
		System.out.println();

		System.out.println("Adult? " + person.isAdult());

	}

}
