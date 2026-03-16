class MuseumRunner{

	public static void main(String[] args){

		Museum museum = new Museum();

		museum.nationalMuseum = 1;
		museum.scienceMuseum = 2;
		museum.artMuseum = 3;
		museum.historyMuseum = 4;
		museum.heritageMuseum = 5;
		museum.sculptureMuseum = 6;
		museum.archaeologicalMuseum = 7;
		museum.culturalMuseum = 8;
		museum.childrenMuseum = 9;
		museum.waxMuseum = 10;
		museum.railwayMuseum = 11;
		museum.tribalMuseum = 12;
		museum.marineMuseum = 13;
		museum.spaceMuseum = 14;
		museum.technologyMuseum = 15;
		museum.coinMuseum = 16;
		museum.textileMuseum = 17;
		museum.craftMuseum = 18;
		museum.freedomMuseum = 19;
		museum.warMuseum = 20;


		Diamond diamond = new Diamond();

		diamond.kohinoor = 1;
		diamond.hopeDiamond = 2;
		diamond.cullinan = 3;
		diamond.orlov = 4;
		diamond.regent = 5;
		diamond.tiffany = 6;
		diamond.pinkStar = 7;
		diamond.blueMoon = 8;
		diamond.goldenJubilee = 9;
		diamond.centenary = 10;
		diamond.greatMogul = 11;
		diamond.starOfAfrica = 12;
		diamond.idolEye = 13;
		diamond.nassak = 14;
		diamond.agraDiamond = 15;
		diamond.dresdenGreen = 16;
		diamond.moonOfBaroda = 17;
		diamond.sancy = 18;
		diamond.florentine = 19;
		diamond.shahDiamond = 20;

		museum.diamond = diamond;

		museum.displayMuseumDetails();
	}
}