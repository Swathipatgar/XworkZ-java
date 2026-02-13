class SmartTVExecutor {
    public static void main(String[] tv) {

        double price = SmartTV.getPrice();
        String brand = SmartTV.getBrand();
        int screen = SmartTV.getScreenSize();
        String resolution = SmartTV.getResolution();
        String display = SmartTV.getDisplayType();
        String os = SmartTV.getOperatingSystem();
        int hdmi = SmartTV.getHDMIPorts();
        int warranty = SmartTV.getWarrantyYears();
        double rating = SmartTV.getRating();
        boolean prime = SmartTV.isPrimeAvailable();

        System.out.println("Brand of the TV: " + brand);
        System.out.println("Price of the TV: " + price);
        System.out.println("Screen Size: " + screen + " Inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Display Type: " + display);
        System.out.println("Operating System: " + os);
        System.out.println("HDMI Ports: " + hdmi);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
