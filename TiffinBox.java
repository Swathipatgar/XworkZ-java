class TiffinBox{

    String brand;
    String material;
    String color;
    int compartments;
    double capacity;
    boolean leakProof;
    int price;
    String shape;
    double weight;
    String lidType;
    boolean microwaveSafe;
    int quantity;

    public TiffinBox(String brand,String material,String color,int compartments,
                     double capacity,boolean leakProof,int price,String shape,
                     double weight,String lidType,boolean microwaveSafe,int quantity){

        this.brand=brand;
        this.material=material;
        this.color=color;
        this.compartments=compartments;
        this.capacity=capacity;
        this.leakProof=leakProof;
        this.price=price;
        this.shape=shape;
        this.weight=weight;
        this.lidType=lidType;
        this.microwaveSafe=microwaveSafe;
        this.quantity=quantity;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Material: "+this.material);
        System.out.println("Color: "+this.color);
        System.out.println("Compartments: "+this.compartments);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("LeakProof: "+this.leakProof);
        System.out.println("Price: "+this.price);
        System.out.println("Shape: "+this.shape);
        System.out.println("Weight: "+this.weight);
        System.out.println("LidType: "+this.lidType);
        System.out.println("MicrowaveSafe: "+this.microwaveSafe);
        System.out.println("Quantity: "+this.quantity);
    }
}