class DSLRExecutor {
    public static void main(String[] args) {

        double price = DSLR.getPrice();
        String brand = DSLR.getBrand();
        int mp = DSLR.getMegapixels();
        String sensor = DSLR.getSensorType();
        boolean wifi = DSLR.hasWiFi();

        System.out.println("Brand of the DSLR: " + brand);
        System.out.println("Price of the DSLR: " + price);
        System.out.println("Megapixels: " + mp + " MP");
        System.out.println("Sensor Type: " + sensor);
        System.out.println("WiFi Supported: " + wifi);
    }
}
