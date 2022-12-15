
public class Item {
	
	 //Declaring variables
	  private String  itemName;
	  private double itemUnitPrice, itemQuantity;
	  
	  // Constuctor with default values
	  public Item() {
		  itemName = "Shoes";
		  itemUnitPrice = 10;
		  itemQuantity = 5;
	  }
	  
	  //Set Methods
	    
	    public void setItemName(String nItemName) {
	    	itemName = nItemName;
	    }
	    
	    public void setItemUnitPrice(double nItemUnitPrice) {
	    	itemUnitPrice = nItemUnitPrice;
	    }
	    
	    public void setItemQuantity(double nItemQuantity) {
	    	itemQuantity = nItemQuantity;
	    }
	
	   //Get Methods
	  
	    public String getItemName() 
	    {
	  	    return itemName;
	    }
	    
	    public double getItemUnitPrice() 
	    {
	    	return itemUnitPrice;
	    }
	    
	    public double getItemQuantity() 
	    {
	    	return itemQuantity;
	    }
	    
	    
	    public double getOrderTotal(){
	    	 return itemUnitPrice * itemQuantity;
	    }
	    
}
