class TourismAngadiRunner{

	public static void main(String[] args){

		TourismAngadi tourism = new TourismAngadi();

		tourism.customers = 1;
		tourism.bookings = 2;
		tourism.guides = 3;
		tourism.buses = 4;
		tourism.hotels = 5;
		tourism.flights = 6;
		tourism.tourManagers = 7;
		tourism.branches = 8;
		tourism.onlineBookings = 9;
		tourism.packagesAvailable = 10;
		tourism.offers = 11;
		tourism.discounts = 12;
		tourism.ratings = 13;
		tourism.reviews = 14;
		tourism.internationalTours = 15;
		tourism.domesticTours = 16;
		tourism.weekendTrips = 17;
		tourism.honeymoonPackages = 18;
		tourism.familyPackages = 19;
		tourism.adventureTrips = 20;

		Package pack = new Package();

		pack.goaTrip = 1;
		pack.keralaTrip = 2;
		pack.kashmirTrip = 3;
		pack.manaliTrip = 4;
		pack.ladakhTrip = 5;
		pack.ootyTrip = 6;
		pack.mysoreTrip = 7;
		pack.andamanTrip = 8;
		pack.thailandTrip = 9;
		pack.dubaiTrip = 10;
		pack.singaporeTrip = 11;
		pack.malaysiaTrip = 12;
		pack.baliTrip = 13;
		pack.srilankaTrip = 14;
		pack.nepalTrip = 15;
		pack.bhutanTrip = 16;
		pack.shimlaTrip = 17;
		pack.darjeelingTrip = 18;
		pack.coorgTrip = 19;
		pack.hampiTrip = 20;

		tourism.pack = pack;

		tourism.displayTourismDetails();
	}
}