class Bracelet {

    double length;
    String color;
    String material;
    double price;
    String size;
    double weight;
    String design;
    boolean isGold;
    boolean isSilver;
    String shape;
    String country;
    String type;
    int stonesCount;
    String claspType;
    String finish;
    String gender;
    String collection;
    String style;
    int warrantyYears;
    boolean isHandmade;

    // Parameterized Constructor
    Bracelet(double length,String color,String material,double price,String size,double weight,
             String design,boolean isGold,boolean isSilver,String shape,String country,
             String type,int stonesCount,String claspType,String finish,String gender,
             String collection,String style,int warrantyYears,boolean isHandmade){

        this.length=length;
        this.color=color;
        this.material=material;
        this.price=price;
        this.size=size;
        this.weight=weight;
        this.design=design;
        this.isGold=isGold;
        this.isSilver=isSilver;
        this.shape=shape;
        this.country=country;
        this.type=type;
        this.stonesCount=stonesCount;
        this.claspType=claspType;
        this.finish=finish;
        this.gender=gender;
        this.collection=collection;
        this.style=style;
        this.warrantyYears=warrantyYears;
        this.isHandmade=isHandmade;

        System.out.println("Bracelet Parameterized Constructor Invoked");
    }
}