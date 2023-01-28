package Creational.FactoryMethod;

public class Client {
	public static void main(String[] args) {
		PersonCreator per = new StudentCreator();
		Person p = per.createPerson();
		System.out.println(p.getType());
		PersonCreator per1 = new TeacherCreator();
		Person p1 = per1.createPerson();
		System.out.println(p1.getType());
	}
}
