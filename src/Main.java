import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.concretes.GoogleManagerAdapter;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user =new User(1, "Erdogan", "Pacaci", "pacacierdogan@gmail.com", "123565");
		User user2=new User(2,"Cemm","M","mermail.com","125615");
		
		UserService userService=new UserManager(new GoogleManagerAdapter(),new HibernateUserDao());
		
		userService.add(user);
		userService.add(user2);
	}

}
