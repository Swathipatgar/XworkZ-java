class VVPuramRunner{

	public static void main(String[] args){

		VVPuram vv = new VVPuram();

		vv.shops = 1;
		vv.visitors = 2;
		vv.streetLength = 3;
		vv.stalls = 4;
		vv.lighting = 5;
		vv.parking = 6;
		vv.security = 7;
		vv.cleaners = 8;
		vv.foodVariety = 9;
		vv.famousItems = 10;
		vv.openingTime = 11;
		vv.closingTime = 12;
		vv.weekendsRush = 13;
		vv.festivalsRush = 14;
		vv.seatingAreas = 15;
		vv.dustbins = 16;
		vv.policeSupport = 17;
		vv.vendors = 18;
		vv.ratings = 19;
		vv.reviews = 20;

		FoodStreet food = new FoodStreet();

		food.dosa = 1;
		food.idli = 2;
		food.vada = 3;
		food.paniPuri = 4;
		food.masalaPuri = 5;
		food.chaat = 6;
		food.pavBhaji = 7;
		food.noodles = 8;
		food.friedRice = 9;
		food.momos = 10;
		food.sandwich = 11;
		food.burger = 12;
		food.pizza = 13;
		food.jalebi = 14;
		food.gulabJamun = 15;
		food.iceCream = 16;
		food.falooda = 17;
		food.badamMilk = 18;
		food.tea = 19;
		food.coffee = 20;

		vv.foodStreet = food;

		vv.displayVVPuramDetails();
	}
}