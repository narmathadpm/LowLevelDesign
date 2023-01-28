package Creational.FactoryMethod;

public class StudentCreator extends PersonCreator{
	public Person createPerson()
	{
		return new Student();
	}
}
