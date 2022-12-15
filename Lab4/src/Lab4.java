import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		System.out.println("Developed and Created By: Gurlal Singh");
		
		//Creating contants for discounts percentages , customer Types and purchase amoounts
		final double FIVEPERCENT = 0.05,TENPERCENT = 0.10,FIFTEENPERCENT = 0.15,TWENTYFIVE = 0.25;
		final String RETAILCUSTOMER = "Retail",WHOLESALECUSTOMER = "Wholesale";
		final double PURFIVEHUNDRED = 500,PURTWOHUNDRED = 200;
		//Creating variables to stores given discount amount and net paid amount
		double discountAmount =0,netPaid;
		
		//Creating object of scanner class
		Scanner kbd = new Scanner(System.in);
		
		//Getting inputs from customer
		System.out.println("Enter the type of customer: ");
		String customerType = kbd.nextLine();
		
		System.out.println("Enter the purchase amount: ");
		double purchaseAmount = kbd.nextDouble();
		
		//Assigning purchaseAmount to netpaid initially
		netPaid = purchaseAmount;
		
		//Decision statements to apply discount based on customer type
		if(customerType.equalsIgnoreCase(RETAILCUSTOMER)) 
		{
			if(purchaseAmount >= PURFIVEHUNDRED) 
			{
				discountAmount = purchaseAmount * TENPERCENT;
				netPaid = purchaseAmount - discountAmount;
				printInvoice(customerType,purchaseAmount,discountAmount,netPaid);
			}
			else
			{
				printInvoice(customerType,purchaseAmount,discountAmount,netPaid);
			}
			
		}
		else if (customerType.equalsIgnoreCase(WHOLESALECUSTOMER))
		{
			if(purchaseAmount < PURTWOHUNDRED) 
			{
				discountAmount = purchaseAmount * FIVEPERCENT;
				netPaid = purchaseAmount - discountAmount;
				printInvoice(customerType,purchaseAmount,discountAmount,netPaid);
			}
			else if(purchaseAmount >PURTWOHUNDRED && purchaseAmount < PURFIVEHUNDRED) 
			{
				discountAmount = purchaseAmount * FIFTEENPERCENT;
				netPaid = purchaseAmount - discountAmount;
				printInvoice(customerType,purchaseAmount,discountAmount,netPaid);
			}
			else if (purchaseAmount > PURFIVEHUNDRED) 
			{
				discountAmount = purchaseAmount * TWENTYFIVE;
				netPaid = purchaseAmount - discountAmount;
				printInvoice(customerType,purchaseAmount,discountAmount,netPaid);
			}
			else 
			{
				printInvoice(customerType,purchaseAmount,discountAmount,netPaid);
			}
		}
		else 
		{
			printInvoice(customerType,purchaseAmount,discountAmount,netPaid);
		}	

	}
	
    public static void  printInvoice(String nCustomerType,double nPurchaseAmount,double nDiscountAmount,double nNetPaid)
    {
    	//Displaying outputs
    	System.out.printf("Customer type is: %s \n", nCustomerType.toUpperCase());
    	System.out.printf("Purchase Amount is: %.2f \n", nPurchaseAmount);
    	System.out.printf("Discount Amount is: %.2f \n", nDiscountAmount);
    	System.out.printf("Net Paid Amount is: %.2f \n", nNetPaid);
    	
        System.exit(0);
    	
    }

}
