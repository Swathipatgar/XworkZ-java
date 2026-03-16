class CompanyRunner{

	public static void main(String[] args){

		Company company = new Company();

		company.google = 1;
		company.microsoft = 2;
		company.amazon = 3;
		company.apple = 4;
		company.meta = 5;
		company.tesla = 6;
		company.ibm = 7;
		company.oracle = 8;
		company.adobe = 9;
		company.intel = 10;
		company.samsung = 11;
		company.nvidia = 12;
		company.infosys = 13;
		company.tcs = 14;
		company.wipro = 15;
		company.capgemini = 16;
		company.cognizant = 17;
		company.accenture = 18;
		company.dell = 19;
		company.hp = 20;


		Project project = new Project();

		project.bankingSystem = 1;
		project.hospitalManagement = 2;
		project.studentManagement = 3;
		project.onlineShopping = 4;
		project.libraryManagement = 5;
		project.payrollSystem = 6;
		project.inventorySystem = 7;
		project.hotelManagement = 8;
		project.carRentalSystem = 9;
		project.railwayReservation = 10;
		project.flightBooking = 11;
		project.foodDelivery = 12;
		project.eLearningPlatform = 13;
		project.socialMediaApp = 14;
		project.weatherApp = 15;
		project.newsPortal = 16;
		project.chatApplication = 17;
		project.gameDevelopment = 18;
		project.portfolioWebsite = 19;
		project.ecommerceWebsite = 20;

		company.project = project;

		company.displayCompanyDetails();
	}
}