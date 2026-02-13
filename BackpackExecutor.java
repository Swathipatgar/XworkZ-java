class BackpackExecutor {
    public static void main(String[] args) {

        double price = Backpack.getPrice();
        String brand = Backpack.getBrand();
        String capacity = Backpack.getCapacity();
        String material = Backpack.getMaterial();
        boolean water = Backpack.isWaterResistant();
        int compartments = Backpack.getCompartments();
        boolean laptop = Backpack.isLaptopCompartmentAvailable();
        int warranty = Backpack.getWarrantyYears();
        double rating = Backpack.getRating();
        boolean prime = Backpack.isPrimeAvailable();

        System.out.println("Brand of the backpack: " + brand);
        System.out.println("Price of the backpack: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Material: " + material);
        System.out.println("Water Resistant: " + water);
        System.out.println("Compartments: " + compartments);
        System.out.println("Laptop Compartment: " + laptop);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
