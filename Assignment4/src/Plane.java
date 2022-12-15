
public abstract class Plane {

	private String planeName;
	private int builtYear;

	// All possible constructors
	public Plane(String planeName, int builtYear) {
		this.planeName = planeName;
		this.builtYear = builtYear;
	}

	public Plane(String planeName) {
		this(planeName, 2017);
	}

	public Plane() {
		this("Airbus", 2014);
	}
	
	//Set Methods
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	
	public boolean setBuiltYear(int builtYear) {
		boolean isValid = false;
		if(builtYear > 0) {
			this.builtYear = builtYear;
			isValid = true;
		}
		return isValid;		
	}
	
	//Get Methods
	
	public String getPlaneName() {
		return this.planeName;
	}
	
	public int getBuiltYear() {
		return this.builtYear;
	}
	
	//Overriding the toString methods
	public String toString() {
		return "PlanName: "+ this.planeName +" Model Year: "+ this.builtYear;
	}

}
