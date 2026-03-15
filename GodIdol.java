class GodIdol {

    String name;
    String material;
    String color;
    double height;
    double weight;
    String godName;
    String origin;
    int price;
    String shopName;
    boolean handmade;
    String festival;
    int quantity;

    public GodIdol(String name,String material,String color,double height,double weight,
                   String godName,String origin,int price,String shopName,
                   boolean handmade,String festival,int quantity){

        this.name=name;
        this.material=material;
        this.color=color;
        this.height=height;
        this.weight=weight;
        this.godName=godName;
        this.origin=origin;
        this.price=price;
        this.shopName=shopName;
        this.handmade=handmade;
        this.festival=festival;
        this.quantity=quantity;
    }

    public void displayDetail(){
        System.out.println("Name: "+this.name);
        System.out.println("Material: "+this.material);
        System.out.println("Color: "+this.color);
        System.out.println("Height: "+this.height);
        System.out.println("Weight: "+this.weight);
        System.out.println("God Name: "+this.godName);
        System.out.println("Origin: "+this.origin);
        System.out.println("Price: "+this.price);
        System.out.println("Shop Name: "+this.shopName);
        System.out.println("Handmade: "+this.handmade);
        System.out.println("Festival: "+this.festival);
        System.out.println("Quantity: "+this.quantity);
    }
}