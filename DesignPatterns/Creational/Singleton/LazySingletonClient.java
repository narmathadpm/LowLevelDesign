package Creational.Singleton;

public class LazySingletonClient {
	public static void main(String[] args) {

		LazySingleton instance = LazySingleton.getInstance();
		LazySingleton instance1 = LazySingleton.getInstance();
		System.out.println(instance);
		System.out.println(instance1);
	}
}
