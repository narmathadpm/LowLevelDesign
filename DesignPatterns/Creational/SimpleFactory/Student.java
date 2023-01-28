package Creational.SimpleFactory;

public class Student extends Person{
	private String dept ;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public  void printInfo()
	{
		System.out.println(getName() + getDept() + getAge()+ "Student");
	}
}
