package Creational.Builder;

public class StudentDTO {
	private String name;
	private String id;
	private String age;

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	private void setAge(String age) {
		this.age = age;
	}

	public static StudentDTOBuilder createInstance()
	{
		return new StudentDTOBuilder();
	}

public static class StudentDTOBuilder
{

	private String name;
	private String id;
	private String age;

	private StudentDTO sto;

	public StudentDTOBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public StudentDTOBuilder setId(String id) {
		this.id = id;
		return this;
	}

	public StudentDTOBuilder setAge(String age) {
		this.age = age;
		return this;
	}

	public StudentDTO build()
	{
		this.sto = new StudentDTO();
		sto.setAge(this.age);
		sto.setId(this.id);
		sto.setName(this.name);
		return sto;
	}

	public StudentDTO getDTO()
	{
	   return this.sto;
	}
}

}
