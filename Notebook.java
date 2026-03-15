class Notebook{

    String brand;
    String size;
    int pages;
    int price;
    String coverColor;
    String paperType;
    double weight;
    boolean ruled;
    String origin;
    String bindingType;
    int quantity;
    String subject;

    public Notebook(String brand,String size,int pages,int price,String coverColor,
                    String paperType,double weight,boolean ruled,String origin,
                    String bindingType,int quantity,String subject){

        this.brand=brand;
        this.size=size;
        this.pages=pages;
        this.price=price;
        this.coverColor=coverColor;
        this.paperType=paperType;
        this.weight=weight;
        this.ruled=ruled;
        this.origin=origin;
        this.bindingType=bindingType;
        this.quantity=quantity;
        this.subject=subject;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Size: "+this.size);
        System.out.println("Pages: "+this.pages);
        System.out.println("Price: "+this.price);
        System.out.println("CoverColor: "+this.coverColor);
        System.out.println("PaperType: "+this.paperType);
        System.out.println("Weight: "+this.weight);
        System.out.println("Ruled: "+this.ruled);
        System.out.println("Origin: "+this.origin);
        System.out.println("BindingType: "+this.bindingType);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Subject: "+this.subject);
    }
}