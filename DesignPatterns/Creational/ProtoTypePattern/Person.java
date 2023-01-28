package Creational.ProtoTypePattern;

public abstract class Person implements Cloneable{
	private String name;
	private String age;
	Person()
	{
		this.name = "1";
		this.name = "2";
	}

	Person(String name, String age)
	{
		this.age = age;
		this.name = name;
	}

	@Override
	public Person clone() throws CloneNotSupportedException {
			Person obj = (Person)super.clone();
			obj.name = "dummy";
			obj.age = "dummy";
			obj.setDept();
			return obj;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public abstract  String setDept();
}
