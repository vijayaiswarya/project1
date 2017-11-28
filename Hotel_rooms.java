package org.aishu;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Hotel_rooms {
	@Id
	@GeneratedValue
	private int room_no;
	private String room_category;
	private String room_facility;
	private int room_charge;
	private int room_capacity;
	private String room_status;
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getRoom_category() {
		return room_category;
	}
	public void setRoom_category(String room_category) {
		this.room_category = room_category;
	}
	public String getRoom_facility() {
		return room_facility;
	}
	public void setRoom_facility(String room_facility) {
		this.room_facility = room_facility;
	}
	public int getRoom_charge() {
		return room_charge;
	}
	public void setRoom_charge(int room_charge) {
		this.room_charge = room_charge;
	}
	public int getRoom_capacity() {
		return room_capacity;
	}
	public void setRoom_capacity(int room_capacity) {
		this.room_capacity = room_capacity;
	}
	public String getRoom_status() {
		return room_status;
	}
	public void setRoom_status(String room_status) {
		this.room_status = room_status;
	}
	

}
