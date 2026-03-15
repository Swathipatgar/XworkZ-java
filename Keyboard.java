class Keyboard{

    String brand;
    String type;
    String color;
    int price;
    boolean wireless;
    String connectionType;
    int keys;
    double weight;
    String origin;
    boolean backlit;
    String layout;
    int warranty;

    public Keyboard(String brand,String type,String color,int price,boolean wireless,
                    String connectionType,int keys,double weight,String origin,
                    boolean backlit,String layout,int warranty){

        this.brand=brand;
        this.type=type;
        this.color=color;
        this.price=price;
        this.wireless=wireless;
        this.connectionType=connectionType;
        this.keys=keys;
        this.weight=weight;
        this.origin=origin;
        this.backlit=backlit;
        this.layout=layout;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Type: "+this.type);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Wireless: "+this.wireless);
        System.out.println("ConnectionType: "+this.connectionType);
        System.out.println("Keys: "+this.keys);
        System.out.println("Weight: "+this.weight);
        System.out.println("Origin: "+this.origin);
        System.out.println("Backlit: "+this.backlit);
        System.out.println("Layout: "+this.layout);
        System.out.println("Warranty: "+this.warranty);
    }
}