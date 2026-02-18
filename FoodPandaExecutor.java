class FoodPandaExecutor
{
    public static void main(String[] foodorder)
    {
        String foodName = "DragonChicken";
        double price = FoodPanda.getFoodPrice(foodName);
        System.out.println("The price of " + foodName + " in FoodPanda is: " + price);
    }
}
