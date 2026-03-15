class Pen{

    String brand;
    String color;
    String intType;
    int price;
    double length;
    double weight;
    String material;
    boolean refillable;
    String origin;
    String tipType;
    int quantity;
    String penType;

    public Pen(String brand,String color,String inkType,int price,double length,
               double weight,String material,boolean refillable,String origin,
               String tipType,int quantity,String penType){

        this.brand=brand;
        this.color=color;
        this.inkType=inkType;
        this.price=price;
        this.length=length;
        this.weight=weight;
        this.material=material;
        this.refillable=refillable;
        this.origin=origin;
        this.tipType=tipType;
        this.quantity=quantity;
        this.penType=penType;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("InkType: "+this.inkType);
        System.out.println("Price: "+this.price);
        System.out.println("Length: "+this.length);
        System.out.println("Weight: "+this.weight);
        System.out.println("Material: "+this.material);
        System.out.println("Refillable: "+this.refillable);
        System.out.println("Origin: "+this.origin);
        System.out.println("TipType: "+this.tipType);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("PenType: "+this.penType);
    }
}