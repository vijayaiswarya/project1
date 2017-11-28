package org.aishu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer_request {
	@Id
	@GeneratedValue
	private int reqid;
	private String room_category;
	private String room_facility;
	private int room_capacity;
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
	public int getRoom_capacity() {
		return room_capacity;
	}
	public void setRoom_capacity(int room_capacity) {
		this.room_capacity = room_capacity;
	}

}
