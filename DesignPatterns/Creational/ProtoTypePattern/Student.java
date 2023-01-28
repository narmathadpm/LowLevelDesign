package Creational.ProtoTypePattern;

public class Student extends Person{
	private String dept;
	public Student(String name, String age)
	{
		super(name, age);
	}
	public   String setDept()
	{
		dept = "uuu";
		return dept;
	}
}
