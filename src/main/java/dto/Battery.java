package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Battery {

	@Id
	private int id;
	private String batteryname;
	private int capacity;
	
	
	@OneToOne(mappedBy = "battery")
	private Mobile mobile;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBatteryname() {
		return batteryname;
	}


	public void setBatteryname(String batteryname) {
		this.batteryname = batteryname;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public Mobile getMobile() {
		return mobile;
	}


	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Battery [id=" + id + ", batteryname=" + batteryname + ", capacity=" + capacity + ", mobile=" + mobile
				+ "]";
	}
	
	
	
}
