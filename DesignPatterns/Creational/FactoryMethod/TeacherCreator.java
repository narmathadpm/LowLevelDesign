package Creational.FactoryMethod;

public class TeacherCreator extends PersonCreator{
	public Person createPerson()
	{
		return new Teacher();
	}
}
