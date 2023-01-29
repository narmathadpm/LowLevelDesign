package Creational.AbstractPattern;

public class AWSResourceFactory extends ResourceFactory{

	public  Storage createStorage()
	{
		Storage storage = new AWSStorage(2);
		return storage;

	}
	public Instance createInstance()
	{
		Instance instance = new AWSInstance();
		return instance;
	}
}
