package entities;

public class Bus {
	
	private Integer seats;
	private String plate;
	private Integer year;
	
	public Bus() {
		
	}
	
	public Bus(Integer seats, String plate, Integer year) {
		this.seats = seats;
		this.plate = plate;
		this.year = year;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
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
		return "Plate: " + plate + ", year: " + year + ", " + seats + " seats";
	}

}
