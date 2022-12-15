
public class MainApp {

	public static void main(String[] args) {
		
		printInventory();
		Customer customer = CustomerManager.createCustomer();
		PurchasedItem[] purchasedItem = PurchasedItemManager.createItem();
		CustomerManager.printCustomer(customer);
		PurchasedItemManager.printItem(purchasedItem);
	}

	// Method used to print available inventory
	public static void printInventory() {
		System.out.printf("Available Inventory\n");
		System.out.printf("==========================\n");
		System.out.printf("Item Name     Unit Price\n");
		for (var i = 0; i < Inventory.ITEMLIST.length; i++) {
			System.out.printf("%-11s  %-44.2f \n", Inventory.ITEMLIST[i],Inventory.PRICELIST[i]);
		}
		System.out.printf("==========================\n");
	}

}
