import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		//Declaring constants
		final double INCOMETAXES = 7;
		final double HEALTHINSURANCE = 2;
		final double PENSIONPLANS = 9;
		
		//Creating scanner object
		Scanner kbd = new Scanner(System.in);
 
		//Taking user inputs
		System.out.println("Enter the working hours for this: ");
		double workingHours = kbd.nextDouble();
		
		System.out.println("Enter the Payrate for an hour: ");
		double hourlyPayrate = kbd.nextDouble();
		

		//Doing calculations
		double grossAmount = workingHours * hourlyPayrate;	
		double incomeTaxDeduction = grossAmount * (INCOMETAXES /100);
		double healthTaxDeduction = grossAmount * (HEALTHINSURANCE /100);
		double pensionTaxDeduction = grossAmount * (PENSIONPLANS /100);
		double netPayable = grossAmount - (incomeTaxDeduction + healthTaxDeduction + pensionTaxDeduction);
		
		//Printing outputs
		System.out.printf("Total Gross Amount is %.2f \n", grossAmount);	
		System.out.printf("Income tax deduction is %.2f \n", incomeTaxDeduction);
		System.out.printf("Health tax deduction is %.2f \n", healthTaxDeduction);
		System.out.printf("Pension tax deduction is %.2f \n", pensionTaxDeduction);
		System.out.printf("Total net payable is %.2f \n" , netPayable);
		
		System.exit(0);
	}

}
