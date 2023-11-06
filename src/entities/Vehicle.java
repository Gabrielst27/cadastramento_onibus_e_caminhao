package entities;

public class Vehicle {
	
	private String type;
	private String plate;
	private Integer year;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String type, String plate, Integer year) {
		this.type = type;
		this.plate = plate;
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
