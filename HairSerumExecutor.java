class HairSerumExecutor {

    public static void main(String[] args) {

        System.out.println("Before Execution");

        HairSerum serum1 = new HairSerum();

        serum1.serumId = 1;
        serum1.serumBrand = "Loreal";
        serum1.serumColor = "Golden";
        serum1.serumPrice = 799.99;
        serum1.serumType = "Hair Care";
        serum1.serumMaterial = "Liquid";
        serum1.isOrganic = true;
        serum1.isNew = true;
        serum1.serumCountry = "France";
        serum1.serumCompany = "Loreal Pvt Ltd";
        serum1.serumStock = 40;
        serum1.serumCategory = "Beauty";
        serum1.serumModel = "LS100";
        serum1.serumWeight = "100ml";
        serum1.serumWidth = "5cm";
        serum1.serumLength = "15cm";
        serum1.serumManufactureDate = "05-02-2026";
        serum1.serumExpiryDate = "05-02-2028";
        serum1.serumCode = "HS001";
        serum1.serumFinish = "Smooth";
        serum1.serumRemark = "Popular Product";
        serum1.serumStyle = "Liquid";
        serum1.serumUse = "Hair Growth";
        serum1.serumQuality = "Premium";
        serum1.serumShape = "Bottle";

        System.out.println("Serum Id: " + serum1.serumId);
        System.out.println("Serum Brand: " + serum1.serumBrand);
        System.out.println("Serum Price: " + serum1.serumPrice);
        System.out.println("Serum Color: " + serum1.serumColor);

        System.out.println("After Execution");
    }
}