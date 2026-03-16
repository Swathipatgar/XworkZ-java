class PlayStoreRunner{

	public static void main(String[] args){

		PlayStore ps = new PlayStore();

		ps.socialApps = 100;
		ps.gamingApps = 200;
		ps.educationApps = 150;
		ps.financeApps = 80;
		ps.travelApps = 60;
		ps.musicApps = 90;
		ps.videoApps = 110;
		ps.shoppingApps = 120;
		ps.healthApps = 70;
		ps.fitnessApps = 65;
		ps.productivityApps = 95;
		ps.photographyApps = 75;
		ps.communicationApps = 140;
		ps.newsApps = 55;
		ps.weatherApps = 40;
		ps.sportsApps = 85;
		ps.lifestyleApps = 66;
		ps.datingApps = 33;
		ps.kidsApps = 45;
		ps.businessApps = 88;


		Application app = new Application();

		app.whatsapp = 1;
		app.instagram = 2;
		app.facebook = 3;
		app.telegram = 4;
		app.youtube = 5;
		app.snapchat = 6;
		app.googleMaps = 7;
		app.gmail = 8;
		app.spotify = 9;
		app.netflix = 10;
		app.amazon = 11;
		app.flipkart = 12;
		app.paytm = 13;
		app.phonePe = 14;
		app.swiggy = 15;
		app.zomato = 16;
		app.ola = 17;
		app.uber = 18;
		app.zoom = 19;
		app.microsoftTeams = 20;


		ps.application = app;

		ps.displayPlayStoreDetails();
	}
}