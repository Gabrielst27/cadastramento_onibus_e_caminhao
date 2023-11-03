package entities;

public class Truck {
	
	private Integer axle;
	private String plate;
	private Integer year;
	
	public Truck() {
		
	}

	public Truck(Integer axle, String plate, Integer year) {
		this.axle = axle;
		this.plate = plate;
		this.year = year;
	}

	public Integer getAxle() {
		return axle;
	}

	public void setAxle(Integer axle) {
		this.axle = axle;
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
	
	public String toString() {
		return "Plate: " + plate + ", year: " + year + ", " + axle + " axles";
	}
	
}
