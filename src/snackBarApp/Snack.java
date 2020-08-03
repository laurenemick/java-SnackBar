package snackBarApp;

public class Snack {
	// fields 
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId) {
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// getters 
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public int getVendingMachineId() {
		return vendingMachineId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalCost(){
		return quantity * cost;
	} 


	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setVendingMachineId(int vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}

	// other methods
	public void addQuantity(int num) {
		this.quantity = quantity + num; 
	}

	public void buySnack(int num) {
		this.quantity = quantity - num;
	} 


}