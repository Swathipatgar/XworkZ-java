class Swiggy
{
    public static double getFoodPrice(String foodName)
    {
        double price = 0.0;

        if(foodName == "Burger") 
		{ 
		price = 101.10;
		return price;
		}
        else if(foodName == "Pizza") 
		{
		price = 202.20; 
		return price; 
		}
        else if(foodName == "Pasta")
		{
		price = 103.30; 
		return price;
		}
        else if(foodName == "Sandwich")
		{ price = 404.40;
		return price;
		}
        else if(foodName == "Biryani") 
		{
		price = 105.50;
		return price; 
		}
        else if(foodName == "Noodles")
		{ 
		price = 606.60; 
		return price;
		}
        else if(foodName == "FriedRice") 
		{
		price = 107.70;
		return price; 
		}
        else if(foodName == "Momos")
		{ 
		price = 108.80;
		return price; 
		}
        else if(foodName == "Roll")
		{ 
		price = 109.90; 
		return price;
		}
        else if(foodName == "Shawarma") 
		{ price = 110.11;
		return price; 
		}
        else if(foodName == "DumBiriyani") 
		{
		price = 122.22;
		return price; 
		}
        else if(foodName == "Nachos")
		{ 
		price = 133.33;
		return price;
		}
        else if(foodName == "HotDog") 
		{
		price = 144.44; 
		return price; 
		}
        else if(foodName == "PaneerTikka")
		{ 
		price = 155.55;
		return price;
		}
        else if(foodName == "Chicken65")
		{ 
		price = 166.66;
		return price;
		}
        else if(foodName == "FishFry")
		{ 
		price = 177.77; 
		return price;
		}
        else if(foodName == "VegMeals")
		{
		price = 108.88;
		return price; 
		}
        else if(foodName == "NonVegMeals") 
		{ price = 199.99;
		return price;
		}
        else if(foodName == "Dosa") 
		{ price = 70.10; 
		return price;
		}
        else if(foodName == "Idli")
		{ price = 60.21; 
		return price;
		}
        else if(foodName == "Vada")
		{ price = 61.32; 
		return price; 
		}
        else if(foodName == "Upma") 
		{ price = 62.43; 
		return price; 
		}
        else if(foodName == "Poori")
		{ price = 63.54; 
		return price;
		}
        else if(foodName == "Paratha")
		{
		price = 56.65;
		return price;
		}
        else if(foodName == "Chapati") 
		{ 
		price = 55.76; 
		return price;
		}
        else if(foodName == "Kebab") 
		{
		price = 287.87; 
		return price; 
		}
        else if(foodName == "Manchurian") 
		{ 
		price = 80.98; 
		return price;
		}
        else if(foodName == "Samosa") 
		{ 
		price = 30.09; return price; 
		}
        else if(foodName == "PavBhaji") 
		{ 
	    price = 40.20; 
		return price;
		}
        else if(foodName == "Masala Papad") 
		{
		price = 33.31; return price; 
		}
        else if(foodName == "RajmaRice")
		{ 
		price = 45.42; return price; 
		}
        else if(foodName == "CurdRice") 
		{
		price = 33.53;
		return price;
		}
        else if(foodName == "TomatoSoup") 
		{ 
		price = 36.64;
		return price; }
		
        else if(foodName == "SweetCornSoup")
		{
		price = 75.75;
		return price;
		}
        else if(foodName == "GulabJamun") 
		{
		price = 86.86; 
		return price;
		}
        else if(foodName == "Rasgulla")
		{ 
		price = 97.97; 
		return price;
		}
        else if(foodName == "IceCream")
		{ 
		price = 40.08; 
		return price; 
		}
        else if(foodName == "Brownie") 
		{ 
		price = 100.19;
		return price; 
		}
        else if(foodName == "Milkshake")
		{
		price = 47.30; 
		return price; 
		}
        else if(foodName == "ColdCoffee") 
		{ price = 40.41;
		return price;
		}
        else if(foodName == "Lassi") 
		{ price = 25.52; 
		return price;
		}
        else if(foodName == "Falooda")
		{
		price = 70.63;
		return price; 
		}
        else if(foodName == "Pancake")
		{ 
		price = 474.74;
		return price; 
		}
        else if(foodName == "Waffle") 
		{
		price = 40.85; return price; 
		}
        else if(foodName == "Donut") 
		{ 
	    price = 40.96;
		return price; 
		}
        else if(foodName == "Cupcake") 
		{ 
		price = 57.07;
		return price;
		}
        else if(foodName == "Muffin")
		{ 
		price = 58.18;
		return price;
		}
        else if(foodName == "FrenchFries")
		{ 
		price = 59.29;
		return price; 
		}
        else if(foodName == "OnionRings") 
		{
		price = 50.40; 
		return price; 
		}
        else if(foodName == "SpringRoll") 
		{
		price = 551.51;
		return price; 
		}
        else if(foodName == "CheeseBalls")
		{
		price = 52.62; 
		return price; 
		}
        else if(foodName == "GarlicBread") 
		{
		price = 57.73; 
		return price;
		}
        else if(foodName == "StuffedCapsicum") 
		{
		price = 84.84; 
		return price; 
		}
        else if(foodName == "MushroomCurry") 
		{
		price = 95.95;
		return price; 
		}
        else if(foodName == "ButterChicken")
		{
		price = 60.06; 
		return price; 
		}
        else
        {
            System.out.println("Food Item Not Available in Swiggy");
        }
        return price;
    }
}
