package lab3;

public class Employee {
   
	//Declaring attributes
	private double hoursWorked,hourlyPayrate;
		
	//Declaring Constructor
	public Employee() {
		hoursWorked = 40;
		hourlyPayrate = 15;
	}
	
	public void setHoursWorked(double pHoursWorked) {
		hoursWorked = pHoursWorked;
	}
	
	public void setHourlyPayrate(double pHourlyPayrate) {
		hourlyPayrate = pHourlyPayrate;
	}
	
	public double gethoursWorked() {
		return hoursWorked;
	}
	public double gethourlyPayrate() {
		return hourlyPayrate;
	}
	
	public double getGrossAmount() {
		return hoursWorked * hourlyPayrate;
	}
	
	public double getIncomeTaxDeduction() {
		return getGrossAmount() * (AppConstants.INCOMETAXES /100);
	}
	public double getHealthTaxDeduction() {
		return getGrossAmount() * (AppConstants.HEALTHINSURANCE /100);
	}
	public double getPensionTaxDeduction() {
		return getGrossAmount() * (AppConstants.PENSIONPLANS /100);
	}
	
	public double getNetPayable() {
		return getGrossAmount() - (getIncomeTaxDeduction() + getHealthTaxDeduction() + getPensionTaxDeduction());
	}
}

