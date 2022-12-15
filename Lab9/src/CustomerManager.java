import java.util.Scanner;

public class CustomerManager {

	// Method used to take user inputs to create customer
	public static Customer createCustomer() {

		// Object of scanner class
		Scanner kbd = new Scanner(System.in);

		// object of customer class
		Customer customer = new Customer();

		// varible to keep track of valid phone number
		boolean isVaidPhone = true;

		System.out.printf("Enter the Customer Name: \n");
		customer.setCustomerName(kbd.nextLine());

		do {
			System.out.printf("Enter the Customer Phone: \n");
			isVaidPhone = customer.setcustomerPhone(kbd.nextLine());
			if (!isVaidPhone) {
				System.out.printf("Please enter the valid Customer Phone: \n");
			}
		} while (!isVaidPhone);

		return customer;

	}

	// Method used to print customer details
	public static void printCustomer(Customer customer) {

		System.out.printf("Customer Name: %s \n", customer.getCustomerName());
		System.out.printf("Customer Phone: %s \n", customer.getcustomerPhone());
	}
}
