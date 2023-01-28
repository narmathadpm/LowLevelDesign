package Creational.SimpleFactory;

import java.text.NumberFormat;
public class Client {
	public static void main(String[] args) {
		Person person = PersonFactory.createPerson("Student");
		System.out.println(person);
	}
}
