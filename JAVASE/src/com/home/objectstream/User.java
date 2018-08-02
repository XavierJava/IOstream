package com.home.objectstream;

import java.io.Serializable;

public class User implements Serializable{

	String name;

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	
}