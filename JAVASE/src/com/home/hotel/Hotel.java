package com.home.hotel;

public class Hotel {

	Room[][] rooms;

	public Hotel() {
		super();
		rooms=new Room[5][10];
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				if(i==0||i==1)
			    rooms[i][j]=new Room((i+1)*100+j+1+"","标准间",false);
				if(i==2||i==3)
				rooms[i][j]=new Room((i+1)*100+j+1+"","双人间",false);
				if(i==4)
				rooms[i][j]=new Room((i+1)*100+j+1+"","豪华间",false);

				
			}
		}
	}
	
	
	public void print() {
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				System.out.print(rooms[i][j].toString());
			}
			System.out.println();
			}
	}


	public void order(String no) {
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
					if((rooms[i][j].getNo()).equals(no)) {
						rooms[i][j].setUse(true);
					}
				
			}
			
			}
		
	}
	
	
}
