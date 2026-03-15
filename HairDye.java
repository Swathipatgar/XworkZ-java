class HairDye{

    String brand;
    String color;
    int price;
    int quantity;
    String type;
    boolean ammoniaFree;
    String origin;
    String chemicalType;
    double weight;
    String packagingType;
    boolean herbal;
    String shadeNumber;

    public HairDye(String brand,String color,int price,int quantity,String type,
                   boolean ammoniaFree,String origin,String chemicalType,double weight,
                   String packagingType,boolean herbal,String shadeNumber){

        this.brand=brand;
        this.color=color;
        this.price=price;
        this.quantity=quantity;
        this.type=type;
        this.ammoniaFree=ammoniaFree;
        this.origin=origin;
        this.chemicalType=chemicalType;
        this.weight=weight;
        this.packagingType=packagingType;
        this.herbal=herbal;
        this.shadeNumber=shadeNumber;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Type: "+this.type);
        System.out.println("AmmoniaFree: "+this.ammoniaFree);
        System.out.println("Origin: "+this.origin);
        System.out.println("ChemicalType: "+this.chemicalType);
        System.out.println("Weight: "+this.weight);
        System.out.println("PackagingType: "+this.packagingType);
        System.out.println("Herbal: "+this.herbal);
        System.out.println("ShadeNumber: "+this.shadeNumber);
    }
}