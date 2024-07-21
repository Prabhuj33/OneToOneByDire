package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mobile {

	
   @JoinColumn
	@Id
		private int id;
		private String brandname;
		private String color;
		
		@OneToOne
		private Battery battery;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBrandname() {
			return brandname;
		}

		public void setBrandname(String brandname) {
			this.brandname = brandname;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Battery getBattery() {
			return battery;
		}

		public void setBattery(Battery battery) {
			this.battery = battery;
		}

		@Override
		public String toString() {
			return "Mobile [id=" + id + ", brandname=" + brandname + ", color=" + color + ", battery=" + battery + "]";
		}
		
	

}
