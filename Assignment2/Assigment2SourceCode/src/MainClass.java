import java.util.Date;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		   
		    // Displaying developed by 
		    System.out.printf("Designed and Developed By: Gurlal Singh \n");
		    
		    //Declaring variables
		    String choice, customerName, customerType, itemName;
		    double itemUnitPrice,itemQuantity;
		
		    //Object of scanner class
		    Scanner kbd = new Scanner(System.in);
			do 
		    {
				//Object of item and customer class
				Item itemobj = new Item();
				Customer custobj = new Customer();
				
			   // Taking user inputs
			   System.out.print("Enter the name of the item:");
			   itemName = kbd.nextLine();
			   itemobj.setItemName(itemName);
			   
				do 
				{
			       System.out.print("Enter the item unit price:");
			       itemUnitPrice = kbd.nextDouble(); 
				   if(itemUnitPrice <= AppConstants.MINPRICECHECK) 
				   {
					 System.out.println("Please re-enter the item price greater than zero:  ");
				   }
				   else {
					   itemobj.setItemUnitPrice(itemUnitPrice);
				   }
			    }
			    while(itemUnitPrice <= AppConstants.MINPRICECHECK);
				
			   do 
			   {					 
				 System.out.print("Enter the item quantity: ");
				 itemQuantity = kbd.nextDouble();
			     if(itemQuantity < AppConstants.MINIMUMITEMQUANTITY || itemQuantity > AppConstants.MAXIMUMITEMQUANTITY) 
				 {
				   System.out.println("Please re-enter the item quantity between 1 to 10: ");
				 }
			     else {
			    	 itemobj.setItemQuantity(itemQuantity);
			     }
			   }
			   while(itemQuantity < AppConstants.MINIMUMITEMQUANTITY || itemQuantity > AppConstants.MAXIMUMITEMQUANTITY);
			   
               kbd.nextLine();
			   
			   do {
				   System.out.print("Enter the name of the customer:");
				   customerName = kbd.nextLine();
				   custobj.setCustomerName(customerName);
				   
				   
				   do {
					   System.out.print("Enter type of the customer:");
					   customerType = kbd.nextLine();
					   custobj.setCustomerType(customerType);
				   }
				   while(customerType.isEmpty());
				   
			    }
			   while(customerName.isEmpty());
				
			   printOrderDetails(itemobj,custobj);
						 
			   System.out.println("Do you have an other order ?  ");
			   choice = kbd.next();
			   
			   kbd.nextLine();
			   					 
			}
			while(choice.equalsIgnoreCase(AppConstants.OPTIONYES)) ;
			
			System.out.printf("No more orders to display");
	}
	
	 public static void printOrderDetails(Item nItemObj , Customer nCustObj) {
		//Initialize date object
		Date CurrentDate = new Date();
		 
		System.out.printf("Store Name: %s \n", AppConstants.StoreName);
		System.out.printf("%s %tB %<te, %<tY %<tT \n", "Order Date: ",CurrentDate);
		System.out.printf("Customer Name: %s \n", nCustObj.getCustomerName());
		System.out.printf("Customer Type: %s \n", nCustObj.getCustomerType());
		System.out.printf("Item Name: %s \n", nItemObj.getItemName());
		System.out.printf("Unit Price: %.2f \n", nItemObj.getItemUnitPrice());
		System.out.printf("Quantity: %.2f \n", nItemObj.getItemQuantity());
		System.out.printf("Order Amount: %.2f \n", nItemObj.getOrderTotal());
		System.out.printf("Order Tax: %.2f \n", nItemObj.getOrderTotal() *  AppConstants.SALESTAXES);
		System.out.printf("Order Discount: %.2f \n", getOrderDiscount(nCustObj.getCustomerType(),nItemObj.getOrderTotal()));
		System.out.printf("Order Total Amount: %.2f \n", nItemObj.getOrderTotal() + nItemObj.getOrderTotal() *
				AppConstants.SALESTAXES - getOrderDiscount(nCustObj.getCustomerType(),nItemObj.getOrderTotal()));
	 }
	
     //Method used to return discount amount based on type of the user
     public static double getOrderDiscount(String nCustomerType,double nOrderAmount) {
    	//Initialize default discount to zero
    	double orderDiscount = AppConstants.MINPRICECHECK;
    	
    	//Decision statements to apply discount based on customer type
        if(nCustomerType.equalsIgnoreCase(AppConstants.RETAILCUSTOMER)) 
    	{
    	 if(nOrderAmount >= AppConstants.PURONETHOUSAND) 
    		{
    			orderDiscount = nOrderAmount * AppConstants.TENPERCENT;
    		}		
    	}
    	else if (nCustomerType.equalsIgnoreCase(AppConstants.WHOLESALECUSTOMER))
        {
    	  if(nOrderAmount < AppConstants.PURFIVEHUNDRED) 
    	  {
    		  orderDiscount = nOrderAmount * AppConstants.TENPERCENT;
    	  }
    	  else if(nOrderAmount >= AppConstants.PURFIVEHUNDRED && nOrderAmount <= AppConstants.PURONETHOUSAND) 
    	  {
    		  orderDiscount = nOrderAmount * AppConstants.TWENTYPERCENT;
    	  }
    	  else if (nOrderAmount > AppConstants.PURONETHOUSAND) 
    	  {
    		  orderDiscount = nOrderAmount * AppConstants.THIRTYPERCENT;
    	  }
        }
        return orderDiscount;
    }
    

}
