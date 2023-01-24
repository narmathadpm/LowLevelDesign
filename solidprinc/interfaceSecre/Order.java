package interfaceSecre;

import java.time.LocalDateTime;

public class Order {
	private LocalDateTime lastLogin;
	private int totalCost;

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
}
