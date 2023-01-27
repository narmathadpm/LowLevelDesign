package Creational.Builder;

public class client {
	public static void main(String[] args) {
		StudentDTO sto = new StudentDTO.StudentDTOBuilder().setAge("23").setId("232").setName("qwewqeqwe").build();
		System.out.println(sto.getName());

	}
}
