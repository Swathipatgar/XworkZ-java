class CameraExecutor {
    public static void main(String[] cam) {

        double price = Camera.getPrice();
        String brand = Camera.getBrand();
        String model = Camera.getModel();
        int mp = Camera.getMegapixels();
        String lens = Camera.getLensType();
        boolean wifi = Camera.isWiFiSupported();
        int warranty = Camera.getWarrantyYears();
        String video = Camera.getVideoQuality();
        double rating = Camera.getRating();
        boolean prime = Camera.isPrimeAvailable();

        System.out.println("Brand of the camera: " + brand);
        System.out.println("Price of the camera: " + price);
        System.out.println("Model: " + model);
        System.out.println("Megapixels: " + mp + " MP");
        System.out.println("Lens Type: " + lens);
        System.out.println("WiFi Support: " + wifi);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Video Quality: " + video);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
