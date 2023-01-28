package Creational.FactoryMethod;

public class TeacherCreator extends PersonCreator{
	public Teacher createPerson()
	{
		return new Teacher();
	}
}
