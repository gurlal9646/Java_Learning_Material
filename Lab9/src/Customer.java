
public class Customer {

	// Declaring default value constants
	public static final String CUSTOMER_NAME = "Gurlal Singh", CUSTOMER_PHONE = "(647) 677-4957";
	public static final int MIN_PHONE_LENGTH = 10;

	private String customerName, customerPhone;

	// All possible constructors
	public Customer() {
		this.customerName = CUSTOMER_NAME;
		this.customerPhone = CUSTOMER_PHONE;
	}

	public Customer(String customerName, String customerPhone) {
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}

	public Customer(String customerName) {
		this(customerName, CUSTOMER_PHONE);
	}

	// Set methods
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public boolean setcustomerPhone(String customerPhone) {
		boolean isValidPhone = true;
		if (customerPhone.length() == MIN_PHONE_LENGTH) {
			this.customerPhone = customerPhone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		} else {
			isValidPhone = false;
		}
		return isValidPhone;
	}

	// Get methods

	public String getCustomerName() {
		return this.customerName;
	}

	public String getcustomerPhone() {
		return this.customerPhone;
	}

}
