class PuffCorn{

    String brand;
    String flavor;
    int price;
    int quantity;
    String color;
    String snackType;
    boolean readyToEat;
    String origin;
    double weight;
    String packetType;
    boolean spicy;
    String shape;

    public PuffCorn(String brand,String flavor,int price,int quantity,String color,
                    String snackType,boolean readyToEat,String origin,double weight,
                    String packetType,boolean spicy,String shape){

        this.brand=brand;
        this.flavor=flavor;
        this.price=price;
        this.quantity=quantity;
        this.color=color;
        this.snackType=snackType;
        this.readyToEat=readyToEat;
        this.origin=origin;
        this.weight=weight;
        this.packetType=packetType;
        this.spicy=spicy;
        this.shape=shape;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Flavor: "+this.flavor);
        System.out.println("Price: "+this.price);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Color: "+this.color);
        System.out.println("SnackType: "+this.snackType);
        System.out.println("ReadyToEat: "+this.readyToEat);
        System.out.println("Origin: "+this.origin);
        System.out.println("Weight: "+this.weight);
        System.out.println("PacketType: "+this.packetType);
        System.out.println("Spicy: "+this.spicy);
        System.out.println("Shape: "+this.shape);
    }
}