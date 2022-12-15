
public class Customer {
	
  private String  customerName, customerType;
  
    //Constructor with default values of classs attributes  
    public Customer() {
	  customerName ="Jack";
	  customerType ="Retail";
    }
  
    //Set Methods
    public void setCustomerName(String nCustomerName) 
    {
    	customerName = nCustomerName;
    }
    
    public void setCustomerType(String nCustomerType) 
    {
    	customerType = nCustomerType;
    }
    
    //Get Methods  
    public String getCustomerName() {
    	return customerName;
    }
    
    public String getCustomerType() {
    	return customerType;
    }
    

}
