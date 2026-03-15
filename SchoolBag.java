class SchoolBag{

    String brand;
    String color;
    String material;
    int price;
    int compartments;
    double weight;
    boolean waterproof;
    String origin;
    String bagType;
    int capacity;
    String zipType;
    int warranty;

    public SchoolBag(String brand,String color,String material,int price,int compartments,
                     double weight,boolean waterproof,String origin,String bagType,
                     int capacity,String zipType,int warranty){

        this.brand=brand;
        this.color=color;
        this.material=material;
        this.price=price;
        this.compartments=compartments;
        this.weight=weight;
        this.waterproof=waterproof;
        this.origin=origin;
        this.bagType=bagType;
        this.capacity=capacity;
        this.zipType=zipType;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("Material: "+this.material);
        System.out.println("Price: "+this.price);
        System.out.println("Compartments: "+this.compartments);
        System.out.println("Weight: "+this.weight);
        System.out.println("Waterproof: "+this.waterproof);
        System.out.println("Origin: "+this.origin);
        System.out.println("BagType: "+this.bagType);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("ZipType: "+this.zipType);
        System.out.println("Warranty: "+this.warranty);
    }
}