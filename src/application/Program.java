package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int aux = 1;
		
		while (aux == 1) {
			System.out.print("How many vehicle will be registered: ");
			int n = sc.nextInt();
			sc.nextLine();
			
			for(int i = 1; i <= n; i++) {
				System.out.printf("\nEnter the vehicle type (1=Truck / 2=Bus): ");
				int vehicle = sc.nextInt();
				
				if(vehicle == 1) {
					sc.nextLine();
					System.out.print("Enter the vehicle plate: ");
					String plate = sc.nextLine();
					System.out.print("Enter the vehicle year: ");
					int year = sc.nextInt();
					sc.nextLine();
					System.out.print("");
				}
				else if(vehicle == 2) {
					sc.nextLine();
					
				}
				else {
					sc.nextLine();
					System.out.print("Unrecognized vehicle. Please, enter a valid one!");
					i--;
				}
			}
		}
		
		
		sc.close();

	}

}
