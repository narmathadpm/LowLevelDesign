package Creational.ProtoTypePattern;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException{
		Person obj = new Student("eee","wewe");
		obj.setDept();
		System.out.println(obj.getName());
		Person obj1 = obj.clone();
		System.out.println(obj1.getName());
	}
}
