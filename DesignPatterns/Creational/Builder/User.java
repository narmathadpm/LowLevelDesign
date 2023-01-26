package Creational.Builder;

import java.time.LocalDate;

public class User {
	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	private Address fAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public Address getAddress() {
		return fAddress;
	}

	public void setAddress(Address address) {
		fAddress = address;
	}
}
