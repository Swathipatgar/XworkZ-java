class CoffeeMug{

    String brand;
    String material;
    String color;
    int price;
    double capacity;
    double weight;
    boolean insulated;
    String origin;
    String shape;
    boolean handle;
    String design;
    int warranty;

    public CoffeeMug(String brand,String material,String color,int price,double capacity,
                     double weight,boolean insulated,String origin,String shape,
                     boolean handle,String design,int warranty){

        this.brand=brand;
        this.material=material;
        this.color=color;
        this.price=price;
        this.capacity=capacity;
        this.weight=weight;
        this.insulated=insulated;
        this.origin=origin;
        this.shape=shape;
        this.handle=handle;
        this.design=design;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Material: "+this.material);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("Weight: "+this.weight);
        System.out.println("Insulated: "+this.insulated);
        System.out.println("Origin: "+this.origin);
        System.out.println("Shape: "+this.shape);
        System.out.println("Handle: "+this.handle);
        System.out.println("Design: "+this.design);
        System.out.println("Warranty: "+this.warranty);
    }
}