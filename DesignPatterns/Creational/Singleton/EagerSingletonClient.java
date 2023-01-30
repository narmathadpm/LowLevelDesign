package Creational.Singleton;

public class EagerSingletonClient {
	public static void main(String[] args) {
		EagerSingleton instance = EagerSingleton.getInstance();
		EagerSingleton instance1 = EagerSingleton.getInstance();
		System.out.println(instance1);
		System.out.println(instance);
	}
}
