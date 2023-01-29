package Creational.AbstractPattern;

public class GoogleStorage implements Storage{
	private int cap;
	GoogleStorage(int cap)
	{
		this.cap = cap;
	}
	public int getId()
	{
		System.out.println("Google ID");
		return cap;
	}
}
