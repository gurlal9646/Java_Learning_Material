
public class CargoPlane extends Plane {
	private double cargoCapacity;

	public CargoPlane(String planeName, int builtYear) {
		super.setPlaneName(planeName);
		super.setBuiltYear(builtYear);
	}

	public CargoPlane(String planeName, int builtYear, int cargoCapacity) {
		super.setPlaneName(planeName);
		super.setBuiltYear(builtYear);
		this.cargoCapacity = cargoCapacity;
	}

	// GetMethods
	public double getCargoCapacity() {
		return this.cargoCapacity;
	}

	// SetMethods
	public boolean setCargoCapacity(double d) {
		boolean isValid = false;
		if (d > 0) {
			this.cargoCapacity = d;
			isValid = true;
		}
		return isValid;
	}

	// Overriding the toString methods
	public String toString() {
		  String returnString = "----------------------------\n";
	        returnString += String.format(" Plane Name  : %s\n", super.getPlaneName() );
	        returnString += String.format(" Built Year  : %d\n", super.getBuiltYear());
	        returnString += String.format(" Cargo Capacity  : %.2f\n", this.cargoCapacity);
	        returnString += "----------------------------\n";
		return returnString; 
	}
}
