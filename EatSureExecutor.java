class EatSureExecutor
{
    public static void main(String[] food)
    {
        String foodName = "PaneerButterMasala";
        double price = EatSure.getFoodPrice(foodName);
        System.out.println("The price of " + foodName + " in EatSure is: " + price);
    }
}
