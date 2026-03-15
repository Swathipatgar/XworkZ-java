class HairSerum{

    String brand;
    String type;
    double volume;
    int price;
    boolean antiFrizz;
    String fragrance;
    String hairType;
    boolean organic;
    String bottleType;
    String origin;
    int quantity;
    String color;

    public HairSerum(String brand,String type,double volume,int price,boolean antiFrizz,
                     String fragrance,String hairType,boolean organic,String bottleType,
                     String origin,int quantity,String color){

        this.brand=brand;
        this.type=type;
        this.volume=volume;
        this.price=price;
        this.antiFrizz=antiFrizz;
        this.fragrance=fragrance;
        this.hairType=hairType;
        this.organic=organic;
        this.bottleType=bottleType;
        this.origin=origin;
        this.quantity=quantity;
        this.color=color;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Type: "+this.type);
        System.out.println("Volume: "+this.volume);
        System.out.println("Price: "+this.price);
        System.out.println("AntiFrizz: "+this.antiFrizz);
        System.out.println("Fragrance: "+this.fragrance);
        System.out.println("HairType: "+this.hairType);
        System.out.println("Organic: "+this.organic);
        System.out.println("BottleType: "+this.bottleType);
        System.out.println("Origin: "+this.origin);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Color: "+this.color);
    }
}