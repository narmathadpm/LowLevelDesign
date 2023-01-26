package Creational.Builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
		UserDTOBuilder withFirstName(String firstName);
		UserDTOBuilder withLastName(String lastName);
	    UserDTOBuilder withBirthday(LocalDate birthDay);
	    UserDTOBuilder withAddress(Address address);
		UserDTO build();
		UserDTO getUserDTO();
}
