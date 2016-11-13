package project;

import java.io.Serializable;

public class Room implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int no_of_rooms;
	private String food;
	private String checkin;
	private String checkout;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_of_rooms() {
		return no_of_rooms;
	}
	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String fo) {
		this.food = fo;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
