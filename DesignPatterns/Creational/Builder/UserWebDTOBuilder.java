package Creational.Builder;

import java.time.LocalDate;

public class UserWebDTOBuilder implements UserDTOBuilder{
	private String firstName;
	private String lastName;
	private String address;
	private String age;
	private UserDTO dto;
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		this.firstName = fname;
		return this;
	}
	@Override
	public UserDTOBuilder withLastName(String lname) {
		this.lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate birthDay) {
		this.age = "10";
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getDoorNo()+address.getState()+address.getStreetName();
		return this;
	}

	@Override
	public UserDTO build() {
		dto = new UserWebDTO(firstName+ " "+lastName, address, age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}


}
