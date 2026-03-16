class CCDRunner{

	public static void main(String[] args){

		CCD ccd = new CCD();

		ccd.branches = 1;
		ccd.customers = 2;
		ccd.tables = 3;
		ccd.chairs = 4;
		ccd.baristas = 5;
		ccd.coffeeMachines = 6;
		ccd.menuItems = 7;
		ccd.desserts = 8;
		ccd.sandwiches = 9;
		ccd.burgers = 10;
		ccd.beverages = 11;
		ccd.wifiUsers = 12;
		ccd.loyaltyMembers = 13;
		ccd.dailySales = 14;
		ccd.monthlySales = 15;
		ccd.ratings = 16;
		ccd.reviews = 17;
		ccd.parking = 18;
		ccd.staff = 19;
		ccd.managers = 20;


		Coffee coffee = new Coffee();

		coffee.espresso = 1;
		coffee.cappuccino = 2;
		coffee.latte = 3;
		coffee.americano = 4;
		coffee.mocha = 5;
		coffee.coldCoffee = 6;
		coffee.icedLatte = 7;
		coffee.caramelCoffee = 8;
		coffee.vanillaCoffee = 9;
		coffee.hazelnutCoffee = 10;
		coffee.filterCoffee = 11;
		coffee.blackCoffee = 12;
		coffee.milkCoffee = 13;
		coffee.chocolateCoffee = 14;
		coffee.irishCoffee = 15;
		coffee.strongCoffee = 16;
		coffee.lightCoffee = 17;
		coffee.instantCoffee = 18;
		coffee.brewCoffee = 19;
		coffee.specialCoffee = 20;

		ccd.coffee = coffee;

		ccd.displayCCDDetails();
	}
}