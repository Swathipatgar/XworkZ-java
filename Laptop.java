class Laptop{

    String brand;
    String model;
    int price;
    int ram;
    int storage;
    String processor;
    double screenSize;
    String color;
    int battery;
    String os;
    boolean fingerprint;
    int warranty;

    public Laptop(String brand,String model,int price,int ram,int storage,
                  String processor,double screenSize,String color,int battery,
                  String os,boolean fingerprint,int warranty){

        this.brand=brand;
        this.model=model;
        this.price=price;
        this.ram=ram;
        this.storage=storage;
        this.processor=processor;
        this.screenSize=screenSize;
        this.color=color;
        this.battery=battery;
        this.os=os;
        this.fingerprint=fingerprint;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Price: "+this.price);
        System.out.println("RAM: "+this.ram);
        System.out.println("Storage: "+this.storage);
        System.out.println("Processor: "+this.processor);
        System.out.println("ScreenSize: "+this.screenSize);
        System.out.println("Color: "+this.color);
        System.out.println("Battery: "+this.battery);
        System.out.println("OS: "+this.os);
        System.out.println("Fingerprint: "+this.fingerprint);
        System.out.println("Warranty: "+this.warranty);
    }
}