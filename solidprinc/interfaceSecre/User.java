package interfaceSecre;

import java.time.LocalDateTime;

public class User extends Entiry{
	private String name;
	private LocalDateTime lastLogin;

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
