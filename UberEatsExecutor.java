class UberEatsExecutor
{
    public static void main(String[] food)
    {
        String foodName = "GrilledChickenSteak";
        double price = UberEats.getFoodPrice(foodName);
        System.out.println("The price of " + foodName + " in UberEats is: " + price);
    }
}
