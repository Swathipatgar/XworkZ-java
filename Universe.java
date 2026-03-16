class Universe{

	int galaxies;
	int solarSystems;
	int planets;
	int stars;
	int blackHoles;
	int nebula;
	int milkyWay;
	int andromeda;
	int comets;
	int asteroids;
	int satellites;
	int lightYears;
	int darkMatter;
	int darkEnergy;
	int cosmicDust;
	int spaceTime;
	int meteors;
	int quasars;
	int pulsars;
	int cosmicRadiation;

	Earth earth;

	public void displayUniverseDetails(){

		this.earth.displayEarthDetails();

		System.out.println("Galaxies: "+galaxies);
		System.out.println("Solar Systems: "+solarSystems);
		System.out.println("Planets: "+planets);
		System.out.println("Stars: "+stars);
		System.out.println("Black Holes: "+blackHoles);
		System.out.println("Nebula: "+nebula);
		System.out.println("Milky Way: "+milkyWay);
		System.out.println("Andromeda: "+andromeda);
		System.out.println("Comets: "+comets);
		System.out.println("Asteroids: "+asteroids);
		System.out.println("Satellites: "+satellites);
		System.out.println("Light Years: "+lightYears);
		System.out.println("Dark Matter: "+darkMatter);
		System.out.println("Dark Energy: "+darkEnergy);
		System.out.println("Cosmic Dust: "+cosmicDust);
		System.out.println("Space Time: "+spaceTime);
		System.out.println("Meteors: "+meteors);
		System.out.println("Quasars: "+quasars);
		System.out.println("Pulsars: "+pulsars);
		System.out.println("Cosmic Radiation: "+cosmicRadiation);

	}
}