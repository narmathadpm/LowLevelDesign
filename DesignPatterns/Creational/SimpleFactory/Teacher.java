package Creational.SimpleFactory;

public class Teacher extends Person{
	public  void printInfo()
	{
		System.out.println(getName()  + getAge()+ "Teacher");
	}
}
