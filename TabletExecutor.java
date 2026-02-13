class TabletExecutor {
    public static void main(String[] tab) {

        double price = Tablet.getPrice();
        String brand = Tablet.getBrand();
        String model = Tablet.getModel();
        int ram = Tablet.getRAM();
        int storage = Tablet.getStorage();
        int battery = Tablet.getBatteryCapacity();
        String display = Tablet.getDisplaySize();
        String os = Tablet.getOperatingSystem();
        double rating = Tablet.getRating();
        boolean prime = Tablet.isPrimeAvailable();

        System.out.println("Brand of the tablet: " + brand);
        System.out.println("Price of the tablet: " + price);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Battery: " + battery + " mAh");
        System.out.println("Display Size: " + display);
        System.out.println("Operating System: " + os);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
