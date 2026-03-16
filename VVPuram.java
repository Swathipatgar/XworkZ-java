class VVPuram{

	int shops;
	int visitors;
	int streetLength;
	int stalls;
	int lighting;
	int parking;
	int security;
	int cleaners;
	int foodVariety;
	int famousItems;
	int openingTime;
	int closingTime;
	int weekendsRush;
	int festivalsRush;
	int seatingAreas;
	int dustbins;
	int policeSupport;
	int vendors;
	int ratings;
	int reviews;

	FoodStreet foodStreet;

	public void displayVVPuramDetails(){

		this.foodStreet.displayFoodDetails();

		System.out.println("Shops: "+shops);
		System.out.println("Visitors: "+visitors);
		System.out.println("Street Length: "+streetLength);
		System.out.println("Stalls: "+stalls);
		System.out.println("Lighting: "+lighting);
		System.out.println("Parking: "+parking);
		System.out.println("Security: "+security);
		System.out.println("Cleaners: "+cleaners);
		System.out.println("Food Variety: "+foodVariety);
		System.out.println("Famous Items: "+famousItems);
		System.out.println("Opening Time: "+openingTime);
		System.out.println("Closing Time: "+closingTime);
		System.out.println("Weekend Rush: "+weekendsRush);
		System.out.println("Festivals Rush: "+festivalsRush);
		System.out.println("Seating Areas: "+seatingAreas);
		System.out.println("Dustbins: "+dustbins);
		System.out.println("Police Support: "+policeSupport);
		System.out.println("Vendors: "+vendors);
		System.out.println("Ratings: "+ratings);
		System.out.println("Reviews: "+reviews);

	}
}