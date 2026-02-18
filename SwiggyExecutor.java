class SwiggyExecutor
{
    public static void main(String[] food)
    {
        String foodName = "Burger";
        double price = Swiggy.getFoodPrice(foodName);
        System.out.println("The price of " + foodName + " in Swiggy is: " + price);
    }
}
