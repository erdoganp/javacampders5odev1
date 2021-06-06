package Business.concretes;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

import Business.abstracts.UserService;
import Core.abstracts.AuthService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService {
	

	
	  
	private AuthService authservice;
	private UserDao userDao;
	
	public UserManager(AuthService authService,UserDao userDao) {
		this.authservice=authService;
		this.userDao=userDao;
	}
	
	private List<String> emailList=new ArrayList<String>();
	private List<String> passwordList=new ArrayList<String>();
	private List<User> userList=new ArrayList<User>();
	
	
	public static boolean emailValidate(String email) {
		String regex="^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern =Pattern.compile(regex);
		Matcher matcher =pattern.matcher(email);
		
		return matcher.matches();
		}
	
	@Override
	public void add(User user) {
		userList=userDao.getAll();
		
		if(user.getName().length()<2 || user.getSurname().length()<2) {
			System.out.println(user.getName()+" " +user.getSurname()+" Name and surname should be at  least 2 char.");
			return;
		}
		if(user.getPw().length()<6) {
			System.out.println(user.getName()+" "+user .getPw()+" :pw should be at least six char!" );
			return;
		}
		
		for(User us : userList) {
			if(us.getEmail()==user.getEmail()) {
				System.out.println(user.getEmail()+": this email has been used please take the different one ");
				return ;
			}
		}
		
		if (emailValidate(user.getEmail())){
            this.userDao.add(user);
            this.authservice.registerToSystem(user.getName() +" " + user.getSurname()+ " has been registered");
		}
		else {System.out.println("please put the valid email");
		}
				
			
		}
		
		
		
	

	@Override
	public void login(String email, String pw) {
		
		for(User us : userList) {
			if(us.getEmail()==email && us.getPw() == pw) {
				System.out.println("sign in succesfully. ");
				return ;
			}
			else {
				System.out.println("please checl the email and pw");
				}
			}
	}

}
