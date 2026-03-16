class ProductionHouseRunner{

	public static void main(String[] args){

		ProductionHouse house = new ProductionHouse();

		house.dharmaProductions = 1;
		house.yashRajFilms = 2;
		house.redChillies = 3;
		house.hombaleFilms = 4;
		house.mythriMovieMakers = 5;
		house.tSeries = 6;
		house.marvelStudios = 7;
		house.warnerBros = 8;
		house.universalPictures = 9;
		house.paramountPictures = 10;
		house.sonyPictures = 11;
		house.dreamWorks = 12;
		house.pixar = 13;
		house.columbiaPictures = 14;
		house.foxStudios = 15;
		house.lionsgate = 16;
		house.legendaryPictures = 17;
		house.villageRoadshow = 18;
		house.eonProductions = 19;
		house.planBEntertainment = 20;


		Movie movie = new Movie();

		movie.kgf = 1;
		movie.bahubali = 2;
		movie.rrr = 3;
		movie.kantara = 4;
		movie.pushpa = 5;
		movie.salaar = 6;
		movie.dangal = 7;
		movie.pathaan = 8;
		movie.jawan = 9;
		movie.avatar = 10;
		movie.titanic = 11;
		movie.inception = 12;
		movie.interstellar = 13;
		movie.spiderman = 14;
		movie.batman = 15;
		movie.superman = 16;
		movie.avengers = 17;
		movie.thor = 18;
		movie.hulk = 19;
		movie.ironman = 20;

		house.movie = movie;

		house.displayProductionHouseDetails();
	}
}