package com.home.objectstream;

import java.io.Serializable;

public class Home implements Serializable{
	static final long serialVersionUID = 828873322904236717L;
	public transient String name;
	public String ID;
	
	public Home(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}

	@Override
	public String toString() {
		return "Home [name=" + name + ", ID=" + ID + "]";
	}
	
}
