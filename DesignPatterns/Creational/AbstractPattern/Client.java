package Creational.AbstractPattern;

public class Client {
	public static void main(String[] args) {
		ResourceFactory resourceFactory = new GoogleResourceFactory();
		System.out.println(resourceFactory.createStorage());
		System.out.println(resourceFactory.createInstance());
	}
}
