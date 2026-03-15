class WaterBottle{

    String brand;
    String material;
    String color;
    double capacity;
    int price;
    boolean leakProof;
    double weight;
    String shape;
    String origin;
    boolean insulated;
    int quantity;
    String lidType;

    public WaterBottle(String brand,String material,String color,double capacity,int price,
                       boolean leakProof,double weight,String shape,String origin,
                       boolean insulated,int quantity,String lidType){

        this.brand=brand;
        this.material=material;
        this.color=color;
        this.capacity=capacity;
        this.price=price;
        this.leakProof=leakProof;
        this.weight=weight;
        this.shape=shape;
        this.origin=origin;
        this.insulated=insulated;
        this.quantity=quantity;
        this.lidType=lidType;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Material: "+this.material);
        System.out.println("Color: "+this.color);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("Price: "+this.price);
        System.out.println("LeakProof: "+this.leakProof);
        System.out.println("Weight: "+this.weight);
        System.out.println("Shape: "+this.shape);
        System.out.println("Origin: "+this.origin);
        System.out.println("Insulated: "+this.insulated);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("LidType: "+this.lidType);
    }
}