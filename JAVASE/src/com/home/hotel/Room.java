package com.home.hotel;

public class Room {
	private String no;
	private String type;// room's type
	private boolean isUse;
	public Room(String no, String type, boolean isUse) {
		super();
		this.no = no;
		this.type = type;
		this.isUse = isUse;
	}
	
	String getNo() {
		return no;
	}
	private void setNo(String no) {
		this.no = no;
	}
	private String getType() {
		return type;
	}
	private void setType(String type) {
		this.type = type;
	}
	private boolean isUse() {
		return isUse;
	}
	public  void setUse(boolean isUse) {
		this.isUse = isUse;
	}

	@Override
	public String toString() {
		return "Room [no=" + no + ", type=" + type + ", isUse=" + isUse + "]";
	}
	
	
	
}
