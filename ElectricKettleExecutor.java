class ElectricKettleExecutor {
    public static void main(String[] kettle) {

        double price = ElectricKettle.getPrice();
        String brand = ElectricKettle.getBrand();
        double capacity = ElectricKettle.getCapacity();
        int power = ElectricKettle.getPowerWatts();
        String material = ElectricKettle.getMaterial();
        String color = ElectricKettle.getColor();
        int warranty = ElectricKettle.getWarrantyYears();
        boolean autoOff = ElectricKettle.isAutoShutOffSupported();
        double rating = ElectricKettle.getRating();
        boolean prime = ElectricKettle.isPrimeAvailable();

        System.out.println("Brand of the electric kettle: " + brand);
        System.out.println("Price of the electric kettle: " + price);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Power: " + power + " Watts");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Auto Shut Off: " + autoOff);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
