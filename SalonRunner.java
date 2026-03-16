class SalonRunner{

	public static void main(String[] args){

		Salon salon = new Salon();

		salon.branches = 1;
		salon.stylists = 2;
		salon.chairs = 3;
		salon.mirrors = 4;
		salon.customers = 5;
		salon.appointments = 6;
		salon.hairProducts = 7;
		salon.beautyProducts = 8;
		salon.openingTime = 9;
		salon.closingTime = 10;
		salon.ratings = 11;
		salon.reviews = 12;
		salon.offers = 13;
		salon.membership = 14;
		salon.bridalBookings = 15;
		salon.dailyCustomers = 16;
		salon.monthlyRevenue = 17;
		salon.staff = 18;
		salon.receptionists = 19;
		salon.managers = 20;


		Service service = new Service();

		service.haircut = 1;
		service.hairColor = 2;
		service.hairSpa = 3;
		service.facial = 4;
		service.cleanup = 5;
		service.manicure = 6;
		service.pedicure = 7;
		service.threading = 8;
		service.waxing = 9;
		service.bleaching = 10;
		service.hairStraightening = 11;
		service.hairSmoothening = 12;
		service.hairKeratin = 13;
		service.hairWash = 14;
		service.beardTrim = 15;
		service.headMassage = 16;
		service.bodyMassage = 17;
		service.bridalMakeup = 18;
		service.partyMakeup = 19;
		service.skinTreatment = 20;

		salon.service = service;

		salon.displaySalonDetails();
	}
}