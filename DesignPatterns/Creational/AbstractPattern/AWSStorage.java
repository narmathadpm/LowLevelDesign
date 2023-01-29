package Creational.AbstractPattern;

public class AWSStorage implements Storage{
	private int cap;
	AWSStorage(int cap)
	{
		this.cap = cap;
	}
	public int getId()
	{
		System.out.println("AWS ID");
		return cap;
	}
}
