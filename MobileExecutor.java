class iPhone17ProMaxExecutor {
    public static void main(String[] args) {

        double price = iPhone17ProMax.getPrice();
        String brand = iPhone17ProMax.getBrand();
        String os = iPhone17ProMax.getOperatingSystem();
        double ram = iPhone17ProMax.getRAMMemorySize();
        double cpu = iPhone17ProMax.getCPUSpeedGHz();
        String storage = iPhone17ProMax.getMemoryStorageCapacity();
        String color = iPhone17ProMax.getColor();
        String model = iPhone17ProMax.getModelName();
        String display = iPhone17ProMax.getDisplaySize();
        double rating = iPhone17ProMax.getRating();

        System.out.println("Brand of the phone: " + brand);
        System.out.println("Price of the phone: " + price);
        System.out.println("Operating System: " + os);
        System.out.println("RAM Memory Size: " + ram + " GB");
        System.out.println("CPU Speed: " + cpu + " GHz");
        System.out.println("Storage Capacity: " + storage);
        System.out.println("Color: " + color);
        System.out.println("Model Name: " + model);
        System.out.println("Display Size: " + display);
        System.out.println("Rating: " + rating);
    }
}
