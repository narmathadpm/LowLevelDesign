package Creational.Singleton;

public class LazySingleTon1 {
	private LazySingleTon1()
	{

	}
	private static class inner
	{
		static LazySingleTon1 lazySingleTon1 = new LazySingleTon1();
	}

	public LazySingleTon1 getInstance()
	{
		return inner.lazySingleTon1;
	}
}
