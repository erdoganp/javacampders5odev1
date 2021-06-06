package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class HibernateUserDao implements UserDao{

		List<User> userList=new ArrayList<User>();
	@Override
	public void add(User user) {
		
		userList.add(user);
		System.out.println(user.getName() + " has been  registered to Hibernate Database ");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() +" has been updated.");
		
	}

	@Override
	public void delete(User user) {
		
		User delUser=null;
		for(User us: userList) {
			if(user.getId() == us.getId()) {
				delUser=us;
			}
		}
		userList.remove(delUser);
		
	}

	@Override
	public User get(int id) {
		for(User us: userList) {
			if(us.getId()==id) {
				return us;
			}
			
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		
		for(User us : userList) {
			if(us.getEmail()==email) {
				return us;
			}
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userList;
	}

}
