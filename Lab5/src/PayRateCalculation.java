import java.util.Scanner;

public class PayRateCalculation {

	public static void main(String[] args) {
		
		//Decalring constants
		final double MINIMUMPAYRATE = 20,MAXPAYRATE = 80,MINHOURSCHECK = 0;
		final String OPTIONYES = "yes";
		
		
		//Declaring variables
		String choice, nameOfEmployee;
		double workingHours,hourlyPayrate;
		
		//Object of scanner class
		Scanner kbd = new Scanner(System.in);
		
		do 
		{
			// Taking user inputs
			System.out.print("Enter the name of the employee: ");
			 nameOfEmployee = kbd.next();
			 do 
			 {
			    System.out.print("Enter the working hours:");
				workingHours = kbd.nextDouble(); 
				if(workingHours <= MINHOURSCHECK) 
			    {
				   System.out.println("Please re-enter the working hours greater than zero:  ");
				}
			 }
			 while(workingHours <= MINHOURSCHECK);
			 do 
			 {
				 
			    System.out.print("Enter the hourly payrate: ");
				hourlyPayrate = kbd.nextDouble();
				if(hourlyPayrate < MINIMUMPAYRATE || hourlyPayrate > MAXPAYRATE) 
				{
					System.out.println("Please re-enter the correct payrate between 20 and 80: ");
				}
			 }
			 while(hourlyPayrate < MINIMUMPAYRATE || hourlyPayrate > MAXPAYRATE);
			 
			 printEmployee(nameOfEmployee,workingHours,hourlyPayrate);
			 
			 System.out.println("Do you have an other employee ?  ");
			 choice = kbd.next();
			 
		}
	
		while(choice.equalsIgnoreCase(OPTIONYES)) ;

		
		System.out.println("No other Employee found to show details ");
		
		kbd.close();
		System.exit(0);
		
		
	}
	public static void  printEmployee(String nEmployeeName,double nHoursWorked,double nHourlyPayrate)
	{
	    	//Displaying outputs
	    	System.out.printf("Employee Name is: %s \n", nEmployeeName.toUpperCase());
	    	System.out.printf("Hours Worked is: %.2f \n", nHoursWorked);
	    	System.out.printf("Hourly Payrate is: %.2f \n", nHourlyPayrate);
	    	System.out.printf("Gross Pay is: %.2f \n", nHoursWorked * nHourlyPayrate );
	       	
	}
	    

}
