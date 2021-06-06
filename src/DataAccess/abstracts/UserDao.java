package DataAccess.abstracts;

import java.util.List;
import Entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete (User user);
	
	User get(int id);
	User getByEmail(String email);
	List<User> getAll();
}
