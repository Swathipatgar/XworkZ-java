class MobilePhone{

    String brand;
    String model;
    String color;
    int price;
    int ram;
    int storage;
    double screenSize;
    int battery;
    String processor;
    String os;
    boolean fingerprint;
    int warranty;

    public MobilePhone(String brand,String model,String color,int price,int ram,
                       int storage,double screenSize,int battery,String processor,
                       String os,boolean fingerprint,int warranty){

        this.brand=brand;
        this.model=model;
        this.color=color;
        this.price=price;
        this.ram=ram;
        this.storage=storage;
        this.screenSize=screenSize;
        this.battery=battery;
        this.processor=processor;
        this.os=os;
        this.fingerprint=fingerprint;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("RAM: "+this.ram);
        System.out.println("Storage: "+this.storage);
        System.out.println("ScreenSize: "+this.screenSize);
        System.out.println("Battery: "+this.battery);
        System.out.println("Processor: "+this.processor);
        System.out.println("OS: "+this.os);
        System.out.println("Fingerprint: "+this.fingerprint);
        System.out.println("Warranty: "+this.warranty);
    }
}