class WonderlaRunner{

	public static void main(String[] args){

		Wonderla wonderla = new Wonderla();

		wonderla.bangalorePark = 1;
		wonderla.kochiPark = 2;
		wonderla.hyderabadPark = 3;
		wonderla.amusementPark = 4;
		wonderla.waterPark = 5;
		wonderla.themePark = 6;
		wonderla.adventurePark = 7;
		wonderla.kidsZone = 8;
		wonderla.familyZone = 9;
		wonderla.thrillZone = 10;
		wonderla.rollerCoaster = 11;
		wonderla.waterSlides = 12;
		wonderla.rainDance = 13;
		wonderla.wavePool = 14;
		wonderla.skyWheel = 15;
		wonderla.funGames = 16;
		wonderla.entertainmentShows = 17;
		wonderla.foodCourt = 18;
		wonderla.lockerFacility = 19;
		wonderla.parkingArea = 20;


		LazyPool lazyPool = new LazyPool();

		lazyPool.wavePool = 1;
		lazyPool.rainDancePool = 2;
		lazyPool.kidsPool = 3;
		lazyPool.familyPool = 4;
		lazyPool.adventurePool = 5;
		lazyPool.waterSlidePool = 6;
		lazyPool.splashPool = 7;
		lazyPool.floatPool = 8;
		lazyPool.circularPool = 9;
		lazyPool.deepPool = 10;
		lazyPool.shallowPool = 11;
		lazyPool.lazyRiver = 12;
		lazyPool.tubePool = 13;
		lazyPool.spiralPool = 14;
		lazyPool.relaxationPool = 15;
		lazyPool.resortPool = 16;
		lazyPool.funPool = 17;
		lazyPool.aquaPool = 18;
		lazyPool.swimmingPool = 19;
		lazyPool.themePool = 20;

		wonderla.lazyPool = lazyPool;

		wonderla.displayWonderlaDetails();
	}
}