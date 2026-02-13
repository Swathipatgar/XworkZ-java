class MixerExecutor {
    public static void main(String[] mixer) {

        double price = Mixer.getPrice();
        String brand = Mixer.getBrand();
        int power = Mixer.getPowerWatts();
        int jars = Mixer.getNumberOfJars();
        String material = Mixer.getMaterial();
        String color = Mixer.getColor();
        int warranty = Mixer.getWarrantyYears();
        double rating = Mixer.getRating();
        boolean prime = Mixer.isPrimeAvailable();
        String country = Mixer.getCountryOfOrigin();

        System.out.println("Brand of the mixer: " + brand);
        System.out.println("Price of the mixer: " + price);
        System.out.println("Power: " + power + " Watts");
        System.out.println("Number of Jars: " + jars);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
        System.out.println("Country of Origin: " + country);
    }
}
