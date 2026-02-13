class MicrowaveExecutor {
    public static void main(String[] args) {

        double price = Microwave.getPrice();
        String brand = Microwave.getBrand();
        int size = Microwave.getSizeLiters();
        String colour = Microwave.getColour();
        String heating = Microwave.getHeatingMethod();
        String finish = Microwave.getFinishType();
        String model = Microwave.getModelName();
        boolean grill = Microwave.isGrillSupported();
        int warranty = Microwave.getWarrantyYears();
        double rating = Microwave.getRating();

        System.out.println("Brand of the microwave: " + brand);
        System.out.println("Price of the microwave: " + price);
        System.out.println("Size: " + size + " Liters");
        System.out.println("Colour: " + colour);
        System.out.println("Heating Method: " + heating);
        System.out.println("Finish Type: " + finish);
        System.out.println("Model Name: " + model);
        System.out.println("Grill Supported: " + grill);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Rating: "+ rating);
    }
}
