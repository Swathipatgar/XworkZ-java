class Kerchiefs{

    String brand;
    String color;
    String material;
    String size;
    int price;
    int quantity;
    String pattern;
    boolean washable;
    String origin;
    double weight;
    String shape;
    String gender;

    public Kerchiefs(String brand,String color,String material,String size,int price,
                     int quantity,String pattern,boolean washable,String origin,
                     double weight,String shape,String gender){

        this.brand=brand;
        this.color=color;
        this.material=material;
        this.size=size;
        this.price=price;
        this.quantity=quantity;
        this.pattern=pattern;
        this.washable=washable;
        this.origin=origin;
        this.weight=weight;
        this.shape=shape;
        this.gender=gender;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("Material: "+this.material);
        System.out.println("Size: "+this.size);
        System.out.println("Price: "+this.price);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Pattern: "+this.pattern);
        System.out.println("Washable: "+this.washable);
        System.out.println("Origin: "+this.origin);
        System.out.println("Weight: "+this.weight);
        System.out.println("Shape: "+this.shape);
        System.out.println("Gender: "+this.gender);
    }
}