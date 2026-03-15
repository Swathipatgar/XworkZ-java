class BedSheet{

    String brand;
    String material;
    String color;
    int price;
    double length;
    double width;
    boolean washable;
    String origin;
    String pattern;
    double weight;
    String sizeType;
    int warranty;

    public BedSheet(String brand,String material,String color,int price,double length,
                    double width,boolean washable,String origin,String pattern,
                    double weight,String sizeType,int warranty){

        this.brand=brand;
        this.material=material;
        this.color=color;
        this.price=price;
        this.length=length;
        this.width=width;
        this.washable=washable;
        this.origin=origin;
        this.pattern=pattern;
        this.weight=weight;
        this.sizeType=sizeType;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Material: "+this.material);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Length: "+this.length);
        System.out.println("Width: "+this.width);
        System.out.println("Washable: "+this.washable);
        System.out.println("Origin: "+this.origin);
        System.out.println("Pattern: "+this.pattern);
        System.out.println("Weight: "+this.weight);
        System.out.println("SizeType: "+this.sizeType);
        System.out.println("Warranty: "+this.warranty);
    }
}