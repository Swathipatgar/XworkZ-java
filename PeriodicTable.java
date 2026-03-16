class PeriodicTable{

	int period1;
	int period2;
	int period3;
	int period4;
	int period5;
	int period6;
	int period7;
	int group1;
	int group2;
	int group3;
	int group4;
	int group5;
	int group6;
	int group7;
	int group8;
	int metals;
	int nonMetals;
	int metalloids;
	int nobleGases;
	int halogens;

	Element element;

	public void displayPeriodicTableDetails(){

		this.element.displayElementDetails();

		System.out.println("Period1: "+period1);
		System.out.println("Period2: "+period2);
		System.out.println("Period3: "+period3);
		System.out.println("Period4: "+period4);
		System.out.println("Period5: "+period5);
		System.out.println("Period6: "+period6);
		System.out.println("Period7: "+period7);
		System.out.println("Group1: "+group1);
		System.out.println("Group2: "+group2);
		System.out.println("Group3: "+group3);
		System.out.println("Group4: "+group4);
		System.out.println("Group5: "+group5);
		System.out.println("Group6: "+group6);
		System.out.println("Group7: "+group7);
		System.out.println("Group8: "+group8);
		System.out.println("Metals: "+metals);
		System.out.println("NonMetals: "+nonMetals);
		System.out.println("Metalloids: "+metalloids);
		System.out.println("NobleGases: "+nobleGases);
		System.out.println("Halogens: "+halogens);

	}
}