class OfficeChairExecutor {
    public static void main(String[] args) {

        double price = OfficeChair.getPrice();
        String brand = OfficeChair.getBrand();
        String material = OfficeChair.getMaterial();
        boolean height = OfficeChair.isAdjustableHeight();
        boolean recline = OfficeChair.isRecliningSupported();
        String color = OfficeChair.getColor();
        int weight = OfficeChair.getWeightCapacity();
        int warranty = OfficeChair.getWarrantyYears();
        double rating = OfficeChair.getRating();
        boolean prime = OfficeChair.isPrimeAvailable();

        System.out.println("Brand of the office chair: " + brand);
        System.out.println("Price of the office chair: " + price);
        System.out.println("Material: " + material);
        System.out.println("Adjustable Height: " + height);
        System.out.println("Reclining Support: " + recline);
        System.out.println("Color: " + color);
        System.out.println("Weight Capacity: " + weight + " Kg");
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
