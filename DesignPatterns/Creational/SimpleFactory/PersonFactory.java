package Creational.SimpleFactory;

public class PersonFactory {
	public static Person createPerson(String type)
	{
       switch(type)
       {
	       case "Student":
			   return new Student();
	       case "Teacher":
			   return new Teacher();
	       default:
			   return null;
       }
	}
}
