
public class Airbus extends Plane implements Printable {

	private int sittingCapacity;

	public Airbus(String planeName, int builtYear) {
		super.setPlaneName(planeName);
		super.setBuiltYear(builtYear);
	}

	public Airbus(String planeName, int builtYear, int sittingCapacity) {
		super.setPlaneName(planeName);
		super.setBuiltYear(builtYear);
		this.sittingCapacity = sittingCapacity;
	}
	
	//GetMethods
	public int getSittingCapacity() {
		return this.sittingCapacity;
	}
	
	//SetMethods
	public boolean setSittingCapacity(int sittingCapacity) {
		boolean isvalid = false;
		if(sittingCapacity > 0) {
			this.sittingCapacity = sittingCapacity;
			isvalid = true;
		}
		
		return isvalid;
		
	}

	@Override
	public void print() {
		System.out.printf("----------------------------\n");
		System.out.printf(" Plane Name : %s \n",super.getPlaneName());
		System.out.printf(" Built Year : %s \n",super.getBuiltYear());
		System.out.printf(" Sitting Capacity : %d \n",this.sittingCapacity);
		System.out.printf("----------------------------\n");

	}

}
