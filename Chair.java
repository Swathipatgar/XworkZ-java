class Chair{

    String brand;
    String material;
    String color;
    int price;
    double height;
    double weight;
    boolean foldable;
    String origin;
    String chairType;
    int legs;
    boolean cushioned;
    int warranty;

    public Chair(String brand,String material,String color,int price,double height,
                 double weight,boolean foldable,String origin,String chairType,
                 int legs,boolean cushioned,int warranty){

        this.brand=brand;
        this.material=material;
        this.color=color;
        this.price=price;
        this.height=height;
        this.weight=weight;
        this.foldable=foldable;
        this.origin=origin;
        this.chairType=chairType;
        this.legs=legs;
        this.cushioned=cushioned;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Material: "+this.material);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Height: "+this.height);
        System.out.println("Weight: "+this.weight);
        System.out.println("Foldable: "+this.foldable);
        System.out.println("Origin: "+this.origin);
        System.out.println("ChairType: "+this.chairType);
        System.out.println("Legs: "+this.legs);
        System.out.println("Cushioned: "+this.cushioned);
        System.out.println("Warranty: "+this.warranty);
    }
}