package snackBarApp;

public class Main {
	private static void workWithData() {
		System.out.println("SnackBar App Test!");

		// String name
		VendingMachine vm1 = new VendingMachine("Food");
		VendingMachine vm2 = new VendingMachine("Drink");

		// String name, int quantity, double cost, int vendingMachineId
		Snack s1 = new Snack("snack 1", 16, 6, vm1.getId());
		Snack s2 = new Snack("snack 2", 35, 2.5, vm2.getId()); 
		Snack s3 = new Snack("snack 3", 29, 6, vm1.getId());
		Snack s4 = new Snack("snack 4", 21, 1, vm2.getId());
		// Stretch 
		Snack chips = new Snack("Chips", 36, 1.75, vm1.getId()); 
		Snack chocBar = new Snack("Chocolate Bar", 35, 1, vm1.getId());
		Snack pretzel = new Snack("Pretzel", 38, 2, vm1.getId()); 
		Snack soda = new Snack("Soda", 19, 2.5, vm2.getId());
		Snack water = new Snack("Water", 20, 2.75, vm2.getId());

		// String name, double cash
		Customer c1 = new Customer("Customer 1", 37.75);
		Customer c2 = new Customer("Customer 2", 28.14);

		System.out.println(c1.getName() + " cash on hand $" + c1.getCash());
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());

		c1.buySnacks(2);
		s4.buySnack(2);

		System.out.println(c1.getName() + " cash on hand $" + c1.getCash());
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());

		System.out.println(c2.getName() + " cash on hand $" + c2.getCash());
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());

		c1.addCash(10);

		System.out.println(c1.getName() + " cash on hand $" + c1.getCash());

		c1.buySnacks(1);

		System.out.println(c1.getName() + " cash on hand $" + c1.getCash());
		System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());

		s3.addQuantity(12);

		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());

		c2.buySnacks(6);
		s3.buySnack(3);

		System.out.println(c2.getName() + " cash on hand $" + c2.getCash());
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());

		// Stretch
		System.out.println("Snack: " + chips.getName());
		System.out.println("Vending Machine: " + vm1.getName());
		System.out.println("Quantity: " + chips.getQuantity());
		System.out.println("Total Cost: $" + chips.getTotalCost());

		System.out.println("Snack: " + chocBar.getName());
		System.out.println("Vending Machine: " + vm1.getName());
		System.out.println("Quantity: " + chocBar.getQuantity());
		System.out.println("Total Cost: $" + chocBar.getTotalCost());

		System.out.println("Snack: " + pretzel.getName());
		System.out.println("Vending Machine: " + vm1.getName());
		System.out.println("Quantity: " + pretzel.getQuantity());
		System.out.println("Total Cost: $" + pretzel.getTotalCost());

		System.out.println("Snack: " + soda.getName());
		System.out.println("Vending Machine: " + vm2.getName());
		System.out.println("Quantity: " + soda.getQuantity());
		System.out.println("Total Cost: $" + soda.getTotalCost());

		System.out.println("Snack: " + water.getName());
		System.out.println("Vending Machine: " + vm2.getName());
		System.out.println("Quantity: " + water.getQuantity());
		System.out.println("Total Cost: $" + water.getTotalCost());
	}

	public static void main(String[] args) {
		workWithData();
	} 
}