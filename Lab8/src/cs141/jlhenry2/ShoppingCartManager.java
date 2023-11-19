package cs141.jlhenry2;
import java.util.*;

public class ShoppingCartManager {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int choice;  
		String newName;
		double newPrice;
		int newQuantity;
		int stayOrGo;
		
		ShoppingCart shopcart = new ShoppingCart();

		//This will get the user input 
		do {
			System.out.println("Welcome!");
			System.out.println("You can choose what to do ... ");
			System.out.printf("To add an item %-20s \n", "type 1");
			System.out.printf("To remove an item %-20s \n", "type 2");
			System.out.printf("To change an items quantity %-20s \n", "type 3");
			System.out.printf("To display your cart %-20s \n", "type 4");
			choice = scnr.nextInt();
			scnr.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("What is the name: ");
				newName = scnr.nextLine();
				System.out.println("What is the price of this item: ");
				newPrice = scnr.nextDouble();
				System.out.println("What is the quantity: ");
				newQuantity = scnr.nextInt();
				//This'll get the user inputs 
				
				Items x = new Items(newName, newPrice, newQuantity);//declaring an item  
				shopcart.addItem(x);
				break;
				//This adds the items 
			case 2:
				System.out.println("What is the name of the item you would like to remove: ");
				newName = scnr.nextLine(); // gets the name
				
				int index = shopcart.getIndex(newName);
				shopcart.removeItem(index);
				break;
				//this'll remove the item 
			case 3:
				System.out.println("What is the name of the item you would like to change the quanity of: ");
				newName = scnr.nextLine();
				System.out.println("What is the new quantity of this item: ");
				newQuantity = scnr.nextInt();
				//This'll get the user inputs 			
				
				int i = shopcart.getIndex(newName);
				shopcart.changeQuantity(i,newQuantity);
				break;
				//this'll change the items quantity 
			case 4:
				shopcart.displayCart();
				
				break;
			default:
				System.out.println("You can choose what to do ... ");
				System.out.printf("To add an item %-20s \n", "type 1");
				System.out.printf("To remove an item %-20s \n", "type 2");
				System.out.printf("To change an items quantity %-20s \n", "type 3");
				System.out.printf("To display your cart %-20s \n", "type 4");
		}	
			System.out.println("If you would like to quit type 1 otherwise type any number");
			stayOrGo = scnr.nextInt();
			
		} while (stayOrGo != 1);
		
		
		

	
	
	}
}
