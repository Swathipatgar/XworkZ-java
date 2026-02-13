class CeilingFanExecutor {
    public static void main(String[] fan) {

        double price = CeilingFan.getPrice();
        String brand = CeilingFan.getBrand();
        int blades = CeilingFan.getBladeCount();
        int speed = CeilingFan.getSpeedRPM();
        String color = CeilingFan.getColor();
        int warranty = CeilingFan.getWarrantyYears();
        boolean remote = CeilingFan.isRemoteSupported();
        String motor = CeilingFan.getMotorType();
        double rating = CeilingFan.getRating();
        boolean prime = CeilingFan.isPrimeAvailable();

        System.out.println("Brand of the ceiling fan: " + brand);
        System.out.println("Price of the ceiling fan: " + price);
        System.out.println("Blade Count: " + blades);
        System.out.println("Speed: " + speed + " RPM");
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Remote Support: " + remote);
        System.out.println("Motor Type: " + motor);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
