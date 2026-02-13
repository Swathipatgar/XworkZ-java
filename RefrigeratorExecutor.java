class RefrigeratorExecutor {
    public static void main(String[] args) {

        double price = Refrigerator.getPrice();
        String brand = Refrigerator.getBrand();
        int capacity = Refrigerator.getCapacity();
        String energy = Refrigerator.getEnergyRating();
        String door = Refrigerator.getDoorType();
        String color = Refrigerator.getColor();
        int warranty = Refrigerator.getWarrantyYears();
        int compressor = Refrigerator.getCompressorWarranty();
        double rating = Refrigerator.getRating();
        boolean prime = Refrigerator.isPrimeAvailable();

        System.out.println("Brand of the refrigerator: " + brand);
        System.out.println("Price of the refrigerator: " + price);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Energy Rating: " + energy);
        System.out.println("Door Type: " + door);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Compressor Warranty: " + compressor + " Years");
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
