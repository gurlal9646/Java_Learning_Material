
public class Inventory {

	// Array for default items and prices
	public static final String[] ITEMLIST = { "TV-1", "TV-2", "Desktop-1", "Desktop-2", "Monitor-1", "Monitor-2",
			"Printer-1", "Printer-2" };
	public static final double[] PRICELIST = { 699, 749, 549, 689, 99, 149, 349, 479 };


	public static int findItem(String itemName) {
		int loc = -1; // default value to return if item not in the list
		for (int i = 0; i < ITEMLIST.length; i++) {
			if (ITEMLIST[i].equalsIgnoreCase(itemName)) {
				loc = i;
				break;
			}
		}
		return loc;
	}
}
