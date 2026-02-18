class BistroExecutor
{
    public static void main(String[] args)
    {
        String foodName = "VegBurrito";

        double price = Bistro.getFoodPrice(foodName);

        System.out.println("The price of " + foodName + " in Zomato is: " + price);
    }
}
