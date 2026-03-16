class LensKartRunner{

	public static void main(String[] args){

		LensKart lenskart = new LensKart();

		lenskart.eyeglasses = 1;
		lenskart.sunglasses = 2;
		lenskart.contactLenses = 3;
		lenskart.computerGlasses = 4;
		lenskart.readingGlasses = 5;
		lenskart.blueLightGlasses = 6;
		lenskart.kidsGlasses = 7;
		lenskart.premiumGlasses = 8;
		lenskart.budgetGlasses = 9;
		lenskart.fashionGlasses = 10;
		lenskart.designerGlasses = 11;
		lenskart.sportsGlasses = 12;
		lenskart.powerGlasses = 13;
		lenskart.bifocalGlasses = 14;
		lenskart.progressiveGlasses = 15;
		lenskart.rimlessGlasses = 16;
		lenskart.halfRimGlasses = 17;
		lenskart.fullRimGlasses = 18;
		lenskart.polarizedGlasses = 19;
		lenskart.photochromicGlasses = 20;


		Frame frame = new Frame();

		frame.roundFrame = 1;
		frame.squareFrame = 2;
		frame.rectangleFrame = 3;
		frame.ovalFrame = 4;
		frame.catEyeFrame = 5;
		frame.aviatorFrame = 6;
		frame.rimlessFrame = 7;
		frame.halfRimFrame = 8;
		frame.fullRimFrame = 9;
		frame.metalFrame = 10;
		frame.plasticFrame = 11;
		frame.titaniumFrame = 12;
		frame.woodenFrame = 13;
		frame.transparentFrame = 14;
		frame.blackFrame = 15;
		frame.goldFrame = 16;
		frame.silverFrame = 17;
		frame.blueFrame = 18;
		frame.kidsFrame = 19;
		frame.sportsFrame = 20;

		lenskart.frame = frame;

		lenskart.displayLensKartDetails();
	}
}