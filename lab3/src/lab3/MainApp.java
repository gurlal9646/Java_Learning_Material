package lab3;

public class MainApp {

	public static void main(String[] args) {
		
		//Creating an object of employee class
		Employee emp1 = new Employee();
		Employee emp2;
		
		//Invoking the methods to update attributes
		emp1.setHoursWorked(20);
		emp1.setHourlyPayrate(15);
		emp2 = emp1;
		
       printEmployee(emp1);
       printEmployee(emp2);

	}
	public static void printEmployee(Employee emp1) {
	//Displaying outputs
	System.out.printf("Hours Worked is %.2f \n", emp1.gethoursWorked());	
	System.out.printf("Hourly payrate is %.2f \n", emp1.gethourlyPayrate());	
	System.out.printf("Total Gross Amount is %.2f \n", emp1.getGrossAmount());	
	System.out.printf("Income tax deduction is %.2f \n", emp1.getIncomeTaxDeduction());
	System.out.printf("Health tax deduction is %.2f \n", emp1.getHealthTaxDeduction());
	System.out.printf("Pension tax deduction is %.2f \n", emp1.getPensionTaxDeduction());
	System.out.printf("Total net payable is %.2f \n" , emp1.getNetPayable());
	System.out.println("---------------------------" );
	}

}
