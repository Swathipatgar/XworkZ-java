class Salon{

	int branches;
	int stylists;
	int chairs;
	int mirrors;
	int customers;
	int appointments;
	int hairProducts;
	int beautyProducts;
	int openingTime;
	int closingTime;
	int ratings;
	int reviews;
	int offers;
	int membership;
	int bridalBookings;
	int dailyCustomers;
	int monthlyRevenue;
	int staff;
	int receptionists;
	int managers;

	Service service;

	public void displaySalonDetails(){

		this.service.displayServiceDetails();

		System.out.println("Branches: "+branches);
		System.out.println("Stylists: "+stylists);
		System.out.println("Chairs: "+chairs);
		System.out.println("Mirrors: "+mirrors);
		System.out.println("Customers: "+customers);
		System.out.println("Appointments: "+appointments);
		System.out.println("Hair Products: "+hairProducts);
		System.out.println("Beauty Products: "+beautyProducts);
		System.out.println("Opening Time: "+openingTime);
		System.out.println("Closing Time: "+closingTime);
		System.out.println("Ratings: "+ratings);
		System.out.println("Reviews: "+reviews);
		System.out.println("Offers: "+offers);
		System.out.println("Membership: "+membership);
		System.out.println("Bridal Bookings: "+bridalBookings);
		System.out.println("Daily Customers: "+dailyCustomers);
		System.out.println("Monthly Revenue: "+monthlyRevenue);
		System.out.println("Staff: "+staff);
		System.out.println("Receptionists: "+receptionists);
		System.out.println("Managers: "+managers);

	}
}