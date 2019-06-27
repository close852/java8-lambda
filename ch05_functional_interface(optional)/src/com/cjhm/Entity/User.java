package com.cjhm.Entity;

import java.io.Serializable;
import java.util.Comparator;

public class User implements Serializable, Comparable<User> {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	// @Override
//	public int compareTo(User o) {
//		return age>o.getAge()?1:-1;
//	}
	@Override
	public int compareTo(User o) {
		return age > o.getAge() ? 1 : -1;
	}

}
