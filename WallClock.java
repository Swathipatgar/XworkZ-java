class WallClock{

    String brand;
    String shape;
    String color;
    int price;
    double diameter;
    String material;
    boolean batteryPowered;
    String origin;
    double weight;
    String style;
    boolean silent;
    int warranty;

    public WallClock(String brand,String shape,String color,int price,double diameter,
                     String material,boolean batteryPowered,String origin,double weight,
                     String style,boolean silent,int warranty){

        this.brand=brand;
        this.shape=shape;
        this.color=color;
        this.price=price;
        this.diameter=diameter;
        this.material=material;
        this.batteryPowered=batteryPowered;
        this.origin=origin;
        this.weight=weight;
        this.style=style;
        this.silent=silent;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Shape: "+this.shape);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Diameter: "+this.diameter);
        System.out.println("Material: "+this.material);
        System.out.println("BatteryPowered: "+this.batteryPowered);
        System.out.println("Origin: "+this.origin);
        System.out.println("Weight: "+this.weight);
        System.out.println("Style: "+this.style);
        System.out.println("Silent: "+this.silent);
        System.out.println("Warranty: "+this.warranty);
    }
}