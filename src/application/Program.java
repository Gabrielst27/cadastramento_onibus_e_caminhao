package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bus;
import entities.Truck;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter vehicle type (1 = BUS or 2 = TRUCK): ");
		int type = sc.nextInt();
		
		if (type == 1) {
			sc.nextLine();
			System.out.print("Enter vehicle plate: ");
			String plate = sc.nextLine();
			System.out.print("Enter vehicle year: ");
			int year = sc.nextInt();
			System.out.print("Enter vehicle seats: ");
			int seats = sc.nextInt();
			
			Bus bus = new Bus(seats, plate, year);
		} else if (type == 2) {
			sc.nextLine();
			System.out.print("Enter vehicle plate: ");
			String plate = sc.nextLine();
			System.out.print("Enter vehicle year: ");
			int year = sc.nextInt();
			System.out.print("Enter vehicle axles: ");
			int axles = sc.nextInt();
			
			Truck truck = new Truck(axles, plate, year);
		}
		
		
		sc.close();

	}

}
