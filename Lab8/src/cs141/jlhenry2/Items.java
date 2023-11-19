package cs141.jlhenry2;

public class Items {
	
	private String name = "";
	private String description; 
	private double price;
	private int quantity; 
	
	
	public Items(String newName, double newPrice, int newQuantity) {
		setName(newName);
		setprice(newPrice);
		setquantity(newQuantity);
	}

	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String newDescription) {
		description = newDescription;
	}
	
	public String getDescription() {
		return description;
	}

	public void setprice(double newPrice) {
		price = newPrice;
	}
	
	public double getprice() {
		return price;
	}


	public void setquantity(int newQuantity) {
		quantity = newQuantity;
	}

	public int getquantity() {
		return quantity;
	}
	
	public void print() {
		System.out.println(quantity + " " + name + " @ $" + price + " = $" + (quantity * price) );	

	}

}
