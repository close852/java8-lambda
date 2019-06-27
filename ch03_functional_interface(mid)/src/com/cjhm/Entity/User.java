package com.cjhm.Entity;

import java.io.Serializable;
import java.util.Comparator;

public class User implements Serializable,Comparable<User> {

	private static final long serialVersionUID = 1L;

	private String username;

	private int age;

	public User(String username, int age) {
		this.username = username;
		this.age = age;
	}

	public User() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(User o) {
//		return age>o.getAge()?1:-1;
//	}
	@Override
	public int compareTo(User o) {
		return age>o.getAge()?1:-1;
	}

}
