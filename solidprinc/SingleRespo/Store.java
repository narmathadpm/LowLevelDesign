package SingleRespo;

import java.util.HashMap;
import java.util.Map;

public class Store {
	Map<String,User> map = new HashMap<>();
	public void store(User user)
	{
		map.put(user.getName(), user);
	}
	public User getUser(String name)
	{
		return map.get(name);
	}
	public void pirnt()
	{
		System.out.println(map.size());
	}
}
