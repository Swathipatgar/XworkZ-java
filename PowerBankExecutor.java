class PowerBankExecutor {
    public static void main(String[] power) {

        double price = PowerBank.getPrice();
        String brand = PowerBank.getBrand();
        int capacity = PowerBank.getCapacity();
        boolean fast = PowerBank.isFastChargingSupported();
        int ports = PowerBank.getOutputPorts();
        String color = PowerBank.getColor();
        int warranty = PowerBank.getWarrantyYears();
        String input = PowerBank.getInputType();
        double rating = PowerBank.getRating();
        boolean prime = PowerBank.isPrimeAvailable();

        System.out.println("Brand of the power bank: " + brand);
        System.out.println("Price of the power bank: " + price);
        System.out.println("Capacity: " + capacity + " mAh");
        System.out.println("Fast Charging: " + fast);
        System.out.println("Output Ports: " + ports);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Input Type: " + input);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
