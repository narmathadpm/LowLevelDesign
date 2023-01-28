package Creational.FactoryMethod;

public class StudentCreator extends PersonCreator{
	public Student createPerson()
	{
		return new Student();
	}
}
