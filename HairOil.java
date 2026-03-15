class HairOilHairOil{

    String brand;
    String type;
    String color;
    int price;
    int quantity;
    boolean herbal;
    String fragrance;
    double volume;
    String origin;
    String hairType;
    boolean organic;
    String bottleType;

    public HairOil(String brand,String type,String color,int price,int quantity,
                   boolean herbal,String fragrance,double volume,String origin,
                   String hairType,boolean organic,String bottleType){

        this.brand=brand;
        this.type=type;
        this.color=color;
        this.price=price;
        this.quantity=quantity;
        this.herbal=herbal;
        this.fragrance=fragrance;
        this.volume=volume;
        this.origin=origin;
        this.hairType=hairType;
        this.organic=organic;
        this.bottleType=bottleType;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Type: "+this.type);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Herbal: "+this.herbal);
        System.out.println("Fragrance: "+this.fragrance);
        System.out.println("Volume: "+this.volume);
        System.out.println("Origin: "+this.origin);
        System.out.println("HairType: "+this.hairType);
        System.out.println("Organic: "+this.organic);
        System.out.println("BottleType: "+this.bottleType);
    }
}