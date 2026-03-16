class TourismAngadi{

	int customers;
	int bookings;
	int guides;
	int buses;
	int hotels;
	int flights;
	int tourManagers;
	int branches;
	int onlineBookings;
	int packagesAvailable;
	int offers;
	int discounts;
	int ratings;
	int reviews;
	int internationalTours;
	int domesticTours;
	int weekendTrips;
	int honeymoonPackages;
	int familyPackages;
	int adventureTrips;

	Package pack;

	public void displayTourismDetails(){

		this.pack.displayPackageDetails();

		System.out.println("Customers: "+customers);
		System.out.println("Bookings: "+bookings);
		System.out.println("Guides: "+guides);
		System.out.println("Buses: "+buses);
		System.out.println("Hotels: "+hotels);
		System.out.println("Flights: "+flights);
		System.out.println("Tour Managers: "+tourManagers);
		System.out.println("Branches: "+branches);
		System.out.println("Online Bookings: "+onlineBookings);
		System.out.println("Packages Available: "+packagesAvailable);
		System.out.println("Offers: "+offers);
		System.out.println("Discounts: "+discounts);
		System.out.println("Ratings: "+ratings);
		System.out.println("Reviews: "+reviews);
		System.out.println("International Tours: "+internationalTours);
		System.out.println("Domestic Tours: "+domesticTours);
		System.out.println("Weekend Trips: "+weekendTrips);
		System.out.println("Honeymoon Packages: "+honeymoonPackages);
		System.out.println("Family Packages: "+familyPackages);
		System.out.println("Adventure Trips: "+adventureTrips);

	}
}