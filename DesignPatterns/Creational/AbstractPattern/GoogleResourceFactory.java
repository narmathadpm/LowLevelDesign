package Creational.AbstractPattern;

public class GoogleResourceFactory extends ResourceFactory{
	public  Storage createStorage()
	{
		Storage storage = new GoogleStorage(2);
		return storage;

	}
	public Instance createInstance()
	{
		Instance instance = new GoogleInstance();
		return instance;
	}
}
