class MirrorExecutor {

    public static void main(String[] args) {

        System.out.println("Before Execution");

        Mirror mirror1 = new Mirror();

        mirror1.mirrorId = 1;
        mirror1.mirrorBrand = "HomeStyle";
        mirror1.mirrorColor = "Silver";
        mirror1.mirrorPrice = 999.99;
        mirror1.mirrorType = "Wall";
        mirror1.mirrorMaterial = "Glass";
        mirror1.isClear = true;
        mirror1.isNew = true;
        mirror1.mirrorCountry = "India";
        mirror1.mirrorCompany = "HomeStyle Pvt Ltd";
        mirror1.mirrorStock = 30;
        mirror1.mirrorCategory = "Home Decor";
        mirror1.mirrorModel = "MR100";
        mirror1.mirrorWeight = "2kg";
        mirror1.mirrorWidth = "40cm";
        mirror1.mirrorLength = "60cm";
        mirror1.mirrorManufactureDate = "15-01-2026";
        mirror1.mirrorExpiryDate = "15-01-2035";
        mirror1.mirrorCode = "MR001";
        mirror1.mirrorFinish = "Glossy";
        mirror1.mirrorRemark = "High Clarity";
        mirror1.mirrorStyle = "Modern";
        mirror1.mirrorUse = "Decoration";
        mirror1.mirrorQuality = "Premium";
        mirror1.mirrorShape = "Rectangle";

        System.out.println("Mirror Id: " + mirror1.mirrorId);
        System.out.println("Mirror Brand: " + mirror1.mirrorBrand);
        System.out.println("Mirror Price: " + mirror1.mirrorPrice);
        System.out.println("Mirror Color: " + mirror1.mirrorColor);

        System.out.println("After Execution");
    }
}