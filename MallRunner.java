class MallRunner{

	public static void main(String[] args){

		Mall mall = new Mall();

		mall.orionMall = 1;
		mall.forumMall = 2;
		mall.garudaMall = 3;
		mall.gopalanMall = 4;
		mall.luluMall = 5;
		mall.phoenixMall = 6;
		mall.vegaCityMall = 7;
		mall.centralMall = 8;
		mall.gtWorldMall = 9;
		mall.esteemMall = 10;
		mall.mantriSquare = 11;
		mall.ubCityMall = 12;
		mall.brookefieldMall = 13;
		mall.royalMeenakshiMall = 14;
		mall.sigmaMall = 15;
		mall.brigadeMall = 16;
		mall.parkSquareMall = 17;
		mall.metroMall = 18;
		mall.expressMall = 19;
		mall.globalMall = 20;


		Shop shop = new Shop();

		shop.clothingStore = 1;
		shop.electronicsStore = 2;
		shop.shoeStore = 3;
		shop.watchStore = 4;
		shop.jewelleryStore = 5;
		shop.toyStore = 6;
		shop.cosmeticStore = 7;
		shop.bookStore = 8;
		shop.mobileStore = 9;
		shop.furnitureStore = 10;
		shop.sportsStore = 11;
		shop.giftStore = 12;
		shop.bagStore = 13;
		shop.opticalStore = 14;
		shop.sweetStore = 15;
		shop.iceCreamStore = 16;
		shop.foodCourt = 17;
		shop.supermarket = 18;
		shop.pharmacy = 19;
		shop.bakery = 20;

		mall.shop = shop;

		mall.displayMallDetails();
	}
}