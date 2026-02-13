class AirPurifierExecutor {
    public static void main(String[] args) {

        double price = AirPurifier.getPrice();
        String brand = AirPurifier.getBrand();
        int area = AirPurifier.getCoverageArea();
        String filter = AirPurifier.getFilterType();
        boolean indicator = AirPurifier.hasAirQualityIndicator();

        System.out.println("Brand of the air purifier: " + brand);
        System.out.println("Price of the air purifier: " + price);
        System.out.println("Coverage Area: " + area + " sq ft");
        System.out.println("Filter Type: " + filter);
        System.out.println("Air Quality Indicator: " + indicator);
    }
}
