class Mirror{

    String brand;
    String shape;
    String frameMaterial;
    String color;
    int price;
    double height;
    double width;
    double weight;
    String origin;
    boolean wallMounted;
    String style;
    int warranty;

    public Mirror(String brand,String shape,String frameMaterial,String color,int price,
                  double height,double width,double weight,String origin,
                  boolean wallMounted,String style,int warranty){

        this.brand=brand;
        this.shape=shape;
        this.frameMaterial=frameMaterial;
        this.color=color;
        this.price=price;
        this.height=height;
        this.width=width;
        this.weight=weight;
        this.origin=origin;
        this.wallMounted=wallMounted;
        this.style=style;
        this.warranty=warranty;
    }

    public void display(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Shape: "+this.shape);
        System.out.println("FrameMaterial: "+this.frameMaterial);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Height: "+this.height);
        System.out.println("Width: "+this.width);
        System.out.println("Weight: "+this.weight);
        System.out.println("Origin: "+this.origin);
        System.out.println("WallMounted: "+this.wallMounted);
        System.out.println("Style: "+this.style);
        System.out.println("Warranty: "+this.warranty);
    }
}