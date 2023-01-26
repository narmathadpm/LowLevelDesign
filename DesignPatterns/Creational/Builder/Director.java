package Creational.Builder;

import java.time.LocalDate;


public class Director {

	public static void main(String[] args) {
		User u = CreateUser();
		UserDTOBuilder dto = new UserWebDTOBuilder();
		UserDTO dto1 = directBuild(dto, u);
	}

	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withAddress(user.getAddress()).withBirthday(user.getBirthDay()).build();
	}

	public static User CreateUser()
	{
		User user = new User();
		user.setBirthDay(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setDoorNo("100");
		address.setStreetName("State Street");
		address.setState("Pawnee");
		user.setAddress(address);
		return user;
	}
}
