package SingleRespo;

public class UserController {
	UserValidator u =new UserValidator();
	Store s = new Store();
	public void createUser(User user)
	{
		if(u.validateUser(user))
		{
			s.store(user);
		}
		s.pirnt();
	}
}
