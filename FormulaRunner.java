class FormulaRunner{

	public static void main(String[] args){

		Formula f1 = new Formula();

		f1.australianGP = 1;
		f1.bahrainGP = 2;
		f1.saudiArabianGP = 3;
		f1.japaneseGP = 4;
		f1.chineseGP = 5;
		f1.miamiGP = 6;
		f1.monacoGP = 7;
		f1.canadianGP = 8;
		f1.spanishGP = 9;
		f1.austrianGP = 10;
		f1.britishGP = 11;
		f1.hungarianGP = 12;
		f1.belgianGP = 13;
		f1.dutchGP = 14;
		f1.italianGP = 15;
		f1.singaporeGP = 16;
		f1.usGP = 17;
		f1.mexicanGP = 18;
		f1.brazilianGP = 19;
		f1.abuDhabiGP = 20;


		Franchise franchise = new Franchise();

		franchise.ferrari = 1;
		franchise.mercedes = 2;
		franchise.redBull = 3;
		franchise.mclaren = 4;
		franchise.astonMartin = 5;
		franchise.alpine = 6;
		franchise.williams = 7;
		franchise.haas = 8;
		franchise.alphaTauri = 9;
		franchise.alfaRomeo = 10;
		franchise.lotus = 11;
		franchise.brawnGP = 12;
		franchise.forceIndia = 13;
		franchise.racingPoint = 14;
		franchise.toroRosso = 15;
		franchise.jordan = 16;
		franchise.jaguar = 17;
		franchise.sauber = 18;
		franchise.prost = 19;
		franchise.minardi = 20;

		f1.franchise = franchise;

		f1.displayFormula1Details();
	}
}