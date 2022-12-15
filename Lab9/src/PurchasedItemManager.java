import java.util.Scanner;

public class PurchasedItemManager {

	public static PurchasedItem[] createItem() {
		// Scanner class object
		Scanner kbd = new Scanner(System.in);

		int totalItems = 0;
		do {
			System.out.printf("Enter the Number of items you want to purchase: \n");
			totalItems = kbd.nextInt();
			if (totalItems <= 0) {
				System.out.printf("Number of items should be greater than zero \n");
			}
		} while (totalItems <= 0);

		// Array of purchased item class
		PurchasedItem[] purchasedItemList = new PurchasedItem[totalItems];

		for (int i = 0; i < purchasedItemList.length; i++) {

			kbd.nextLine();

			PurchasedItem purchasedItem = new PurchasedItem();
			boolean isValidItem = true, isValidQuantity = true;
			do {
				System.out.printf("Enter the Item Name: \n");
				isValidItem = purchasedItem.setItemName(kbd.nextLine());
				if (!isValidItem) {
					System.out.printf("Please enter the items available in the inventory \n");
				}
			} while (!isValidItem);

			do {
				System.out.printf("Enter the Item Quantity: \n");
				isValidQuantity = purchasedItem.setQuantity(kbd.nextInt());
				if (!isValidQuantity) {
					System.out.printf("Please enter the items quantity in between 1 and 10 \n");
				}
			} while (!isValidQuantity);

			purchasedItemList[i] = purchasedItem;

			kbd.close();

		}
		return purchasedItemList;
	}

	public static void printItem(PurchasedItem[] purchasedItem) {
		int totalQuantity = 0;
		double totalInvoicePrice = 0;
		System.out.printf("====================================== \n");
		System.out.printf("Item Name  Quantity  Unit Price  Sub Total \n");
		for (var i = 0; i < purchasedItem.length; i++) {
			totalQuantity += purchasedItem[i].getQuantity();
			totalInvoicePrice += purchasedItem[i].getSubTotal();
			System.out.printf("%-9s  %-7d   %-9.2f   %-9.2f \n", purchasedItem[i].getName(),
					purchasedItem[i].getQuantity(), purchasedItem[i].getPrice(), purchasedItem[i].getSubTotal());
		}
		System.out.printf("====================================== \n");
		System.out.printf("Total      %-7d   %18.2f \n", totalQuantity, totalInvoicePrice);
	}
}
