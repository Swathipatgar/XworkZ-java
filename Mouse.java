class Mouse{

    String brand;
    String color;
    int price;
    boolean wireless;
    String connectionType;
    int dpi;
    double weight;
    String origin;
    boolean rechargeable;
    String type;
    int buttons;
    int warranty;

    public Mouse(String brand,String color,int price,boolean wireless,String connectionType,
                 int dpi,double weight,String origin,boolean rechargeable,
                 String type,int buttons,int warranty){

        this.brand=brand;
        this.color=color;
        this.price=price;
        this.wireless=wireless;
        this.connectionType=connectionType;
        this.dpi=dpi;
        this.weight=weight;
        this.origin=origin;
        this.rechargeable=rechargeable;
        this.type=type;
        this.buttons=buttons;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Wireless: "+this.wireless);
        System.out.println("ConnectionType: "+this.connectionType);
        System.out.println("DPI: "+this.dpi);
        System.out.println("Weight: "+this.weight);
        System.out.println("Origin: "+this.origin);
        System.out.println("Rechargeable: "+this.rechargeable);
        System.out.println("Type: "+this.type);
        System.out.println("Buttons: "+this.buttons);
        System.out.println("Warranty: "+this.warranty);
    }
}