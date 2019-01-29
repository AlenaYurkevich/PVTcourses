package core;

public class Person {
	public String name;
	public String surname;
	public int age;
	public String phone;

	String whitespace = " ";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void printAllInformation() {
		System.out.print("Person info: " + name + whitespace + surname + whitespace + age + whitespace + phone);
	}

	public void printName() {
		System.out.print("Name and surname: " + name + whitespace + surname);
	}

	public boolean isAdult() {
		int adultAge = 18;
		return this.age >= adultAge;
	}
}
