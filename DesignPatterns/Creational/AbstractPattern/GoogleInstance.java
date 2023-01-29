package Creational.AbstractPattern;

public class GoogleInstance implements Instance{
	@Override
	public void stop()
	{
		System.out.println("Google Stopped");
	}
	@Override
	public void start()
	{
		System.out.println("Google Started");
	}

	public void addStorage(Storage storage)
	{
      System.out.println("Storage"+ storage);
	}
}
