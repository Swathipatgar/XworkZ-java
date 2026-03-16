class CCD{

	int branches;
	int customers;
	int tables;
	int chairs;
	int baristas;
	int coffeeMachines;
	int menuItems;
	int desserts;
	int sandwiches;
	int burgers;
	int beverages;
	int wifiUsers;
	int loyaltyMembers;
	int dailySales;
	int monthlySales;
	int ratings;
	int reviews;
	int parking;
	int staff;
	int managers;

	Coffee coffee;

	public void displayCCDDetails(){

		this.coffee.displayCoffeeDetails();

		System.out.println("Branches: "+branches);
		System.out.println("Customers: "+customers);
		System.out.println("Tables: "+tables);
		System.out.println("Chairs: "+chairs);
		System.out.println("Baristas: "+baristas);
		System.out.println("Coffee Machines: "+coffeeMachines);
		System.out.println("Menu Items: "+menuItems);
		System.out.println("Desserts: "+desserts);
		System.out.println("Sandwiches: "+sandwiches);
		System.out.println("Burgers: "+burgers);
		System.out.println("Beverages: "+beverages);
		System.out.println("Wifi Users: "+wifiUsers);
		System.out.println("Loyalty Members: "+loyaltyMembers);
		System.out.println("Daily Sales: "+dailySales);
		System.out.println("Monthly Sales: "+monthlySales);
		System.out.println("Ratings: "+ratings);
		System.out.println("Reviews: "+reviews);
		System.out.println("Parking: "+parking);
		System.out.println("Staff: "+staff);
		System.out.println("Managers: "+managers);

	}
}