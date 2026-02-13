class MixerGrinderExecutor {
    public static void main(String[] args) {

        double price = MixerGrinder.getPrice();
        String brand = MixerGrinder.getBrand();
        int wattage = MixerGrinder.getWattage();
        int jars = MixerGrinder.getJarCount();
        int warranty = MixerGrinder.getWarrantyYears();

        System.out.println("Brand of the mixer grinder: " + brand);
        System.out.println("Price of the mixer grinder: " + price);
        System.out.println("Wattage: " + wattage + " Watts");
        System.out.println("Number of Jars: " + jars);
        System.out.println("Warranty: " + warranty + " Years");
    }
}
