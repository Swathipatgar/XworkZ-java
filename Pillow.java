class Pillow{

    String brand;
    String color;
    String material;
    int price;
    String shape;
    String origin;
    int quantity;
    boolean washable;
    double weight;
    String softness;
    String roomType;
    int warranty;

    public Pillow(String brand,String color,String material,int price,String shape,
                  String origin,int quantity,boolean washable,double weight,
                  String softness,String roomType,int warranty){

        this.brand=brand;
        this.color=color;
        this.material=material;
        this.price=price;
        this.shape=shape;
        this.origin=origin;
        this.quantity=quantity;
        this.washable=washable;
        this.weight=weight;
        this.softness=softness;
        this.roomType=roomType;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("Material: "+this.material);
        System.out.println("Price: "+this.price);
        System.out.println("Shape: "+this.shape);
        System.out.println("Origin: "+this.origin);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Washable: "+this.washable);
        System.out.println("Weight: "+this.weight);
        System.out.println("Softness: "+this.softness);
        System.out.println("RoomType: "+this.roomType);
        System.out.println("Warranty: "+this.warranty);
    }
}