package Creational.AbstractPattern;

public class AWSInstance implements Instance{

	@Override
   public void stop()
	{
		System.out.println("AWSInstance Stopped");
	}
	@Override
	public void start()
	{
		System.out.println("AWSInstance Started");
	}

	public void addStorage(Storage storage)
	{
		System.out.println("Storage"+ storage);
	}
}
