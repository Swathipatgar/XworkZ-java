class CeilingFan{

    String brand;
    String color;
    int price;
    int blades;
    double size;
    int speedLevels;
    boolean remoteControl;
    String origin;
    double weight;
    String motorType;
    boolean energySaving;
    int warranty;

    public CeilingFan(String brand,String color,int price,int blades,double size,
                      int speedLevels,boolean remoteControl,String origin,
                      double weight,String motorType,boolean energySaving,int warranty){

        this.brand=brand;
        this.color=color;
        this.price=price;
        this.blades=blades;
        this.size=size;
        this.speedLevels=speedLevels;
        this.remoteControl=remoteControl;
        this.origin=origin;
        this.weight=weight;
        this.motorType=motorType;
        this.energySaving=energySaving;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Blades: "+this.blades);
        System.out.println("Size: "+this.size);
        System.out.println("SpeedLevels: "+this.speedLevels);
        System.out.println("RemoteControl: "+this.remoteControl);
        System.out.println("Origin: "+this.origin);
        System.out.println("Weight: "+this.weight);
        System.out.println("MotorType: "+this.motorType);
        System.out.println("EnergySaving: "+this.energySaving);
        System.out.println("Warranty: "+this.warranty);
    }
}