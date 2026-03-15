class Socket{

    String brand;
    String color;
    int pinCount;
    int price;
    String material;
    boolean shockProof;
    String origin;
    double weight;
    String shape;
    String installationType;
    int quantity;
    String usageType;

    public Socket(String brand,String color,int pinCount,int price,String material,
                  boolean shockProof,String origin,double weight,String shape,
                  String installationType,int quantity,String usageType){

        this.brand=brand;
        this.color=color;
        this.pinCount=pinCount;
        this.price=price;
        this.material=material;
        this.shockProof=shockProof;
        this.origin=origin;
        this.weight=weight;
        this.shape=shape;
        this.installationType=installationType;
        this.quantity=quantity;
        this.usageType=usageType;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("PinCount: "+this.pinCount);
        System.out.println("Price: "+this.price);
        System.out.println("Material: "+this.material);
        System.out.println("ShockProof: "+this.shockProof);
        System.out.println("Origin: "+this.origin);
        System.out.println("Weight: "+this.weight);
        System.out.println("Shape: "+this.shape);
        System.out.println("InstallationType: "+this.installationType);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("UsageType: "+this.usageType);
    }
}