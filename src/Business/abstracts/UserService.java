package Business.abstracts;

import Entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(String email,String pw);
}
