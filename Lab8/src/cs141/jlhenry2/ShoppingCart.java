package cs141.jlhenry2;
import java.util.*;

public class ShoppingCart {
	Scanner scnr = new Scanner(System.in);
	private String custName;
	private String date;
	//more variables yayyyyyyyyyy
	
	ArrayList<Items> itemsInCart = new ArrayList<Items>();
	//an array list of the items in the cart
	
	public ShoppingCart () {
		
	}
	
	public void addItem(Items newItem) {
		itemsInCart.add(newItem); // This calls the method in the items class and adds the items 
	}
	
	public void removeItem(int x) {
		itemsInCart.remove(x); // This calls the method in the items class and removes the items 
	}
	
	public void changeQuantity(int i, int amt) {
		itemsInCart.get(i).setquantity(amt);
	}
	
	public void displayNameAndDes(int i) {
		System.out.println("Name: " + itemsInCart.get(i).getName());
		System.out.println("Description: " + itemsInCart.get(i).getDescription());
	}
	public int getIndex(String name) {
		for (Items i : itemsInCart) {
			if (i.getName().equals(name)){
				return itemsInCart.indexOf(i);
			}
		}
		
		return 0;
	}
	
	public void displayCart() {
		System.out.println("Please enter the customers name: ");
		custName = scnr.nextLine();
		System.out.println("Please enter the date: ");
		date = scnr.nextLine();
		System.out.println("***********************************************");
		System.out.println("Customer: " + custName);
		System.out.println("Date: " + date);
		System.out.println("***********************************************");
		for (Items i : itemsInCart) {
			i.print();
		}
		System.out.println("***********************************************");

	}
	

}
