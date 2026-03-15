class StudyTable{

    String material;
    String color;
    double height;
    int price;
    String shape;
    String origin;
    int drawers;
    boolean foldable;
    double weight;
    String style;
    String furnitureType;
    int quantity;

    public StudyTable(String material,String color,double height,int price,String shape,
                      String origin,int drawers,boolean foldable,double weight,
                      String style,String furnitureType,int quantity){

        this.material=material;
        this.color=color;
        this.height=height;
        this.price=price;
        this.shape=shape;
        this.origin=origin;
        this.drawers=drawers;
        this.foldable=foldable;
        this.weight=weight;
        this.style=style;
        this.furnitureType=furnitureType;
        this.quantity=quantity;
    }

    public void display(){
        System.out.println("Material: "+this.material);
        System.out.println("Color: "+this.color);
        System.out.println("Height: "+this.height);
        System.out.println("Price: "+this.price);
        System.out.println("Shape: "+this.shape);
        System.out.println("Origin: "+this.origin);
        System.out.println("Drawers: "+this.drawers);
        System.out.println("Foldable: "+this.foldable);
        System.out.println("Weight: "+this.weight);
        System.out.println("Style: "+this.style);
        System.out.println("FurnitureType: "+this.furnitureType);
        System.out.println("Quantity: "+this.quantity);
    }
}