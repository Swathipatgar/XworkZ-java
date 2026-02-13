class AirCoolerExecutor {
    public static void main(String[] ac) {

        double price = AirCooler.getPrice();
        String brand = AirCooler.getBrand();
        String material = AirCooler.getMaterial();
        String mounting = AirCooler.getMountingType();
        String feature = AirCooler.getSpecialFeature();
        String colour = AirCooler.getColour();
        String controls = AirCooler.getControlsType();
        int capacity = AirCooler.getReservoirCapacity();
        int weight = AirCooler.getItemWeight();
        String model = AirCooler.getModelName();
        String form = AirCooler.getFormFactor();

        System.out.println("Brand of the Air Cooler: " + brand);
        System.out.println("Price of the Air Cooler: " + price);
        System.out.println("Material: " + material);
        System.out.println("Mounting Type: " + mounting);
        System.out.println("Special Features: " + feature);
        System.out.println("Colour: " + colour);
        System.out.println("Controls Type: " + controls);
        System.out.println("Reservoir Capacity: " + capacity + " Liters");
        System.out.println("Item Weight: " + weight + " Grams");
        System.out.println("Model Name: " + model);
        System.out.println("Form Factor: " + form);
    }
}
