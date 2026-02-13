class RouterExecutor {
    public static void main(String[] router) {

        double price = Router.getPrice();
        String brand = Router.getBrand();
        String model = Router.getModel();
        String band = Router.getFrequencyBand();
        int speed = Router.getSpeedMbps();
        int antennas = Router.getAntennaCount();
        boolean mimo = Router.isMU_MIMOSupported();
        int warranty = Router.getWarrantyYears();
        double rating = Router.getRating();
        boolean prime = Router.isPrimeAvailable();

        System.out.println("Brand of the router: " + brand);
        System.out.println("Price of the router: " + price);
        System.out.println("Model: " + model);
        System.out.println("Frequency Band: " + band);
        System.out.println("Speed: " + speed + " Mbps");
        System.out.println("Antenna Count: " + antennas);
        System.out.println("MU-MIMO Support: " + mimo);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
