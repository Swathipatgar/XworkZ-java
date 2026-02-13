class WashingMachineExecutor {
    public static void main(String[] args) {

        double price = WashingMachine.getPrice();
        String brand = WashingMachine.getBrand();
        int capacity = WashingMachine.getCapacity();
        String type = WashingMachine.getType();
        String energy = WashingMachine.getEnergyRating();
        String color = WashingMachine.getColor();
        int warranty = WashingMachine.getWarrantyYears();
        int motorWarranty = WashingMachine.getMotorWarranty();
        double rating = WashingMachine.getRating();
        boolean prime = WashingMachine.isPrimeAvailable();

        System.out.println("Brand of the washing machine: " + brand);
        System.out.println("Price of the washing machine: " + price);
        System.out.println("Capacity: " + capacity + " Kg");
        System.out.println("Type: " + type);
        System.out.println("Energy Rating: " + energy);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Motor Warranty: " + motorWarranty + " Years");
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
