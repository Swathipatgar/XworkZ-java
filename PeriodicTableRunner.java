class PeriodicTableRunner{

	public static void main(String[] args){

		PeriodicTable table = new PeriodicTable();

		table.period1 = 1;
		table.period2 = 2;
		table.period3 = 3;
		table.period4 = 4;
		table.period5 = 5;
		table.period6 = 6;
		table.period7 = 7;
		table.group1 = 8;
		table.group2 = 9;
		table.group3 = 10;
		table.group4 = 11;
		table.group5 = 12;
		table.group6 = 13;
		table.group7 = 14;
		table.group8 = 15;
		table.metals = 16;
		table.nonMetals = 17;
		table.metalloids = 18;
		table.nobleGases = 19;
		table.halogens = 20;

		Element element = new Element();

		element.hydrogen = 1;
		element.helium = 2;
		element.lithium = 3;
		element.beryllium = 4;
		element.boron = 5;
		element.carbon = 6;
		element.nitrogen = 7;
		element.oxygen = 8;
		element.fluorine = 9;
		element.neon = 10;
		element.sodium = 11;
		element.magnesium = 12;
		element.aluminium = 13;
		element.silicon = 14;
		element.phosphorus = 15;
		element.sulphur = 16;
		element.chlorine = 17;
		element.argon = 18;
		element.potassium = 19;
		element.calcium = 20;

		table.element = element;

		table.displayPeriodicTableDetails();
	}
}