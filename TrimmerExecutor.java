class TrimmerExecutor {
    public static void main(String[] args) {

        double price = Trimmer.getPrice();
        String brand = Trimmer.getBrand();
        String model = Trimmer.getModel();
        int battery = Trimmer.getBatteryBackup();
        boolean cordless = Trimmer.isCordless();
        int settings = Trimmer.getLengthSettings();
        String blade = Trimmer.getBladeMaterial();
        int warranty = Trimmer.getWarrantyYears();
        double rating = Trimmer.getRating();
        boolean prime = Trimmer.isPrimeAvailable();

        System.out.println("Brand of the trimmer: " + brand);
        System.out.println("Price of the trimmer: " + price);
        System.out.println("Model: " + model);
        System.out.println("Battery Backup: " + battery + " Minutes");
        System.out.println("Cordless: " + cordless);
        System.out.println("Length Settings: " + settings);
        System.out.println("Blade Material: " + blade);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
