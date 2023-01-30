package Creational.Singleton;

public class EagerSingleton {

	private EagerSingleton()
	{
	}
	private static final EagerSingleton obj = new EagerSingleton();

	public static EagerSingleton getInstance()
	{
		return obj;
	}
}


