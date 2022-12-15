import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		// Declaring Constants
		final double ZERO = 0;
		final int BUILTYEAR = 2019;
		String PLANNAME = "Airbus 360";

		//Object of scanner class
		Scanner kbd = new Scanner(System.in);

		// Declaring variables
		int numberOfAirbus, numberOfCargoPlane;
		boolean isValid;

		//Taking user inputs for number of planes of each category
		do {
			System.out.printf("Enter the number of Airbus plane : \n");
			numberOfAirbus = kbd.nextInt();
			if (numberOfAirbus <= ZERO) {
				System.out.printf("Number of Airbus plane should be greater than zero");
			}
		} while (numberOfAirbus <= ZERO);

		do {
			System.out.printf("Enter the number of Cargo plane : \n");
			numberOfCargoPlane = kbd.nextInt();
			if (numberOfCargoPlane <= ZERO) {
				System.out.printf("Number of Cargo plane should be greater than zero");
			}
		} while (numberOfCargoPlane <= ZERO);


		
		// Declaring array of objects for Airbus and CargoPlane with the size enter by
		// the user
		Airbus[] listOfAirbus = new Airbus[numberOfAirbus];
		CargoPlane[] listOfCargoPlane = new CargoPlane[numberOfCargoPlane];


		//User inputs to enter data for Airbus planes 
		for (int i = 0; i < listOfAirbus.length; i++) {

			kbd.nextLine();
			
			// Declaring object of airbus class with default values
			Airbus airBus = new Airbus(PLANNAME, BUILTYEAR);

			System.out.printf("Enter the name of Airbus plane : \n");
			airBus.setPlaneName(kbd.nextLine());
			
			do {
				System.out.printf("Enter the Airbus Plane Built year : \n");
				isValid = airBus.setBuiltYear(kbd.nextInt());
				if (!isValid) {
					System.out.printf("Airbus Plane Built year should be greater than zero \n");
				}
			} while (!isValid);

			do {
				System.out.printf("Enter the Airbus plane Sitting Capacity : \n");
				isValid = airBus.setSittingCapacity(kbd.nextInt());
				if (!isValid) {
					System.out.printf("Airbus Plane Sitting Capacity should be greater than zero \n");
				}
			} while (!isValid);

			listOfAirbus[i] = airBus;

		}
		

		//User inputs to enter data for Cargo planes 
		for (int i = 0; i < listOfCargoPlane.length; i++) {

			kbd.nextLine();
			// Declaring object of CargoPlane class with default values
			CargoPlane cargoPlane = new CargoPlane(PLANNAME, BUILTYEAR);

			System.out.printf("Enter the name of Cargo plane : \n");
			cargoPlane.setPlaneName(kbd.nextLine());
			


			do {
				System.out.printf("Enter the Cargo Plane Built year : \n");
				isValid = cargoPlane.setBuiltYear(kbd.nextInt());
				if (!isValid) {
					System.out.printf("Plane Built year should be greater than zero \n");
				}
			} while (!isValid);

			do {
				System.out.printf("Enter the plane Cargo Capacity : \n");
				isValid = cargoPlane.setCargoCapacity(kbd.nextDouble());
				if (!isValid) {
					System.out.printf("Plan Cargo Capacity should be greater than zero \n");
				}
			} while (!isValid);

			listOfCargoPlane[i] = cargoPlane;

		}
		
		//Printing the Value for Airbus and CargoPlanes
		printAirbus(listOfAirbus);
		printCargoPlane(listOfCargoPlane);

	}

	public static void printAirbus(Airbus[] airBus) {
		System.out.printf("----------------------------\n");
		System.out.printf("List of Airbus plane \n");
		for (Airbus data : airBus) {
			data.print();
		}
	}
	
	public static void printCargoPlane(CargoPlane[] cargoPlane) {
		System.out.printf("List of Cargo plane \n");
		for (CargoPlane data : cargoPlane) {
			System.out.println(data);
		}

	}

}
