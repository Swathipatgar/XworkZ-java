class LaptopExecutor {
    public static void main(String[] args) {

        double price = Laptop.getPrice();
        String brand = Laptop.getBrand();
        String processor = Laptop.getProcessor();
        int ram = Laptop.getRAM();
        int storage = Laptop.getStorage();

        System.out.println("Brand of the laptop: " + brand);
        System.out.println("Price of the laptop: " + price);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }
}
