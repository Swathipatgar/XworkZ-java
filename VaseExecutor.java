class VaseExecutor {

    public static void main(String[] args) {

        System.out.println("Before Execution");

        Vase vase1 = new Vase();

        vase1.vaseId = 1;
        vase1.vaseName = "Flower Vase";
        vase1.vaseColor = "White";
        vase1.vaseMaterial = "Ceramic";
        vase1.vasePrice = 799.99;
        vase1.vaseShape = "Round";
        vase1.vaseHeight = "25cm";
        vase1.vaseWidth = "10cm";
        vase1.vaseWeight = "500g";
        vase1.vaseBrand = "HomeDecor";
        vase1.vaseType = "Decorative";
        vase1.isNew = true;
        vase1.isFragile = true;
        vase1.vaseCountry = "India";
        vase1.vaseCompany = "Decor Pvt Ltd";
        vase1.vaseStock = 40;
        vase1.vaseCategory = "Home Decor";
        vase1.vaseModel = "VD101";
        vase1.vaseFinish = "Glossy";
        vase1.vaseCode = "VS001";
        vase1.vaseRemark = "Best Seller";
        vase1.vaseManufactureDate = "12-02-2026";
        vase1.vaseExpiryDate = "12-02-2035";
        vase1.vaseUse = "Flower Decoration";
        vase1.vaseQuality = "Premium";

        System.out.println("Vase Id: " + vase1.vaseId);
        System.out.println("Vase Name: " + vase1.vaseName);
        System.out.println("Vase Price: " + vase1.vasePrice);
        System.out.println("Vase Color: " + vase1.vaseColor);

        System.out.println("After Execution");
    }
}