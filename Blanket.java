class Blanket {

    String brand;
    String color;
    String material;
    double price;
    String size;
    boolean isWinter;

    Blanket(String brand, String color, String material, double price, String size, boolean isWinter) {

        this.brand = brand;
        this.color = color;
        this.material = material;
        this.price = price;
        this.size = size;
        this.isWinter = isWinter;

        System.out.println("Blanket Parameterized Constructor Invoked");
    }
}