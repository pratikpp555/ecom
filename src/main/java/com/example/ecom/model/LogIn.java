package com.example.ecom.model;

import java.util.Arrays;

public class LogIn {
  

	String username;

	char[] password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LogIn [username=" + username + ", password=" + Arrays.toString(password) + "]";
	}



}
