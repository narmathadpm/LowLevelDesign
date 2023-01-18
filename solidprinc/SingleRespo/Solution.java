package SingleRespo;
/*
Every class should have single responsibility.
we splitted validate user separately
we can split store also.
 */
public class Solution {
	public static void main(String[] args) {
		UserController u =new UserController();
		User user1 = new User("narmatha", 15);
		User user2 = new User("alex", 99);
		u.createUser(user1);
		u.createUser(user2);
	}
}
