class InductionCooktopExecutor {
    public static void main(String[] cook) {

        double price = InductionCooktop.getPrice();
        String brand = InductionCooktop.getBrand();
        int power = InductionCooktop.getPowerWatts();
        String control = InductionCooktop.getControlType();
        int presets = InductionCooktop.getPresetMenus();
        String color = InductionCooktop.getColor();
        int warranty = InductionCooktop.getWarrantyYears();
        boolean autoOff = InductionCooktop.isAutoShutOffSupported();
        double rating = InductionCooktop.getRating();
        boolean prime = InductionCooktop.isPrimeAvailable();

        System.out.println("Brand of the induction cooktop: " + brand);
        System.out.println("Price of the induction cooktop: " + price);
        System.out.println("Power: " + power + " Watts");
        System.out.println("Control Type: " + control);
        System.out.println("Preset Menus: " + presets);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Auto Shut Off: " + autoOff);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
