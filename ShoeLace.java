class ShoeLace {

    String color;
    String material;
    double lengthInCm;
    double price;
    String brand;
    String type;
    boolean isElastic;
    String pattern;
    String country;
    int durabilityMonths;
	
    ShoeLace(String color, String material, double lengthInCm, double price, String brand,
             String type, boolean isElastic, String pattern, String country, int durabilityMonths) {

        this.color = color;
        this.material = material;
        this.lengthInCm = lengthInCm;
        this.price = price;
        this.brand = brand;
        this.type = type;
        this.isElastic = isElastic;
        this.pattern = pattern;
        this.country = country;
        this.durabilityMonths = durabilityMonths;

        System.out.println("ShoeLace Parameterized Constructor Invoked");
    }
}