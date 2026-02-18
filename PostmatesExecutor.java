class PostmatesExecutor
{
    public static void main(String[] foodiee)
    {
        String foodName = "DragonChicken";
        double price = Postmates.getFoodPrice(foodName);
        System.out.println("The price of " + foodName + " in FoodPanda is: " + price);
    }
}
