
public class PurchasedItem {
	
	// Declaring constants for min, max quantity 
	public static final int MIN_QUANTITY = 1, MAX_QUANTITY = 10;
	
	// Declaring class attributes
	private String name;
	private int quantity;
	private double price;

	//Constructors
	public PurchasedItem(String name, int quantity) {
		this.setItemName(name);
		this.setQuantity(quantity);
	}
	public PurchasedItem() {
		this.setItemName(Inventory.ITEMLIST[0]);
		this.setQuantity(MIN_QUANTITY);
	}

	//Set methods
	public boolean setItemName(String name) {
		boolean isValidItem = true;
		int loc = Inventory.findItem(name);
		if (loc >= 0) {
			this.name = name;
			this.price = Inventory.PRICELIST[loc];
		}
		else {
			isValidItem = false;
		}
		return isValidItem;
	}

	public boolean setQuantity(int quantity) {
		boolean isValidQuantity= true;
		if ((quantity >= MIN_QUANTITY) && (quantity <= MAX_QUANTITY)) {
			this.quantity = quantity;
		}
		else {
			isValidQuantity = false;
		}
		return isValidQuantity;
	}

	//Get methods
	public String getName() {
		return this.name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double getPrice() {
		return this.price;
	}

	public double getSubTotal() {
		return this.price * this.quantity;
	}
	
	//To string used to print value by passing object in println

	public String toString(){
	 	return this.name + " "+ this.quantity + " "+ this.price + " " + this.getSubTotal();
	}

}
