class Charger{

    String brand;
    String type;
    int power;
    int price;
    String color;
    double weight;
    String origin;
    boolean fastCharging;
    String cableType;
    int voltage;
    int warranty;
    String deviceType;

    public Charger(String brand,String type,int power,int price,String color,
                   double weight,String origin,boolean fastCharging,String cableType,
                   int voltage,int warranty,String deviceType){

        this.brand=brand;
        this.type=type;
        this.power=power;
        this.price=price;
        this.color=color;
        this.weight=weight;
        this.origin=origin;
        this.fastCharging=fastCharging;
        this.cableType=cableType;
        this.voltage=voltage;
        this.warranty=warranty;
        this.deviceType=deviceType;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Type: "+this.type);
        System.out.println("Power: "+this.power);
        System.out.println("Price: "+this.price);
        System.out.println("Color: "+this.color);
        System.out.println("Weight: "+this.weight);
        System.out.println("Origin: "+this.origin);
        System.out.println("FastCharging: "+this.fastCharging);
        System.out.println("CableType: "+this.cableType);
        System.out.println("Voltage: "+this.voltage);
        System.out.println("Warranty: "+this.warranty);
        System.out.println("DeviceType: "+this.deviceType);
    }
}