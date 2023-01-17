package SingleRespo;

public class UserValidator {
	public boolean validateUser(User user)
	{
		if(user.getName() != null && user.getAge() > 10)
		{
			return true;
		}
		return false;
	}
}
