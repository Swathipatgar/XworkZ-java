class Helmet {

    String brand;
    String color;
    double price;
	
    Helmet(String brand, String color, double price) {

        this.brand = brand;
        this.color = color;
        this.price = price;

        System.out.println("Helmet Parameterized Constructor Invoked");
    }
}