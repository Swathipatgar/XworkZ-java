class HeadphonesExecutor {
    public static void main(String[] phone) {

        double price = Headphones.getPrice();
        String brand = Headphones.getBrand();
        String type = Headphones.getType();
        boolean bluetooth = Headphones.isBluetoothSupported();
        int battery = Headphones.getBatteryLife();
        String color = Headphones.getColor();
        int warranty = Headphones.getWarrantyYears();
        boolean noise = Headphones.isNoiseCancellationAvailable();
        double rating = Headphones.getRating();
        boolean prime = Headphones.isPrimeAvailable();

        System.out.println("Brand of the headphones: " + brand);
        System.out.println("Price of the headphones: " + price);
        System.out.println("Type: " + type);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Battery Life: " + battery + " Hours");
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Noise Cancellation: " + noise);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available:" + prime);
    }
}
