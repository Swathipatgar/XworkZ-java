class UniverseRunner{

	public static void main(String[] args){

		Universe universe = new Universe();

		universe.galaxies = 1;
		universe.solarSystems = 2;
		universe.planets = 3;
		universe.stars = 4;
		universe.blackHoles = 5;
		universe.nebula = 6;
		universe.milkyWay = 7;
		universe.andromeda = 8;
		universe.comets = 9;
		universe.asteroids = 10;
		universe.satellites = 11;
		universe.lightYears = 12;
		universe.darkMatter = 13;
		universe.darkEnergy = 14;
		universe.cosmicDust = 15;
		universe.spaceTime = 16;
		universe.meteors = 17;
		universe.quasars = 18;
		universe.pulsars = 19;
		universe.cosmicRadiation = 20;

		Earth earth = new Earth();

		earth.asia = 1;
		earth.africa = 2;
		earth.northAmerica = 3;
		earth.southAmerica = 4;
		earth.antarctica = 5;
		earth.europe = 6;
		earth.australia = 7;
		earth.india = 8;
		earth.china = 9;
		earth.usa = 10;
		earth.oceans = 11;
		earth.mountains = 12;
		earth.rivers = 13;
		earth.forests = 14;
		earth.deserts = 15;
		earth.atmosphere = 16;
		earth.gravity = 17;
		earth.water = 18;
		earth.climate = 19;
		earth.biodiversity = 20;

		universe.earth = earth;

		universe.displayUniverseDetails();
	}
}