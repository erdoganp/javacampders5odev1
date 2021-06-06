package Entities.concretes;

import Entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String name;
	private String surname;
	private String email;
	private String pw;
	
	public User() {
		
	}

	public User(int id, String name, String surname, String email, String pw) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.pw = pw;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
