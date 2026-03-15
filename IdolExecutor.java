class IdolExecutor {

    public static void main(String[] args) {
        System.out.println("Before Execution");
        Idol idol1 = new Idol();

        idol1.idolId = 1;
        idol1.idolName = "Ganesha";
        idol1.idolMaterial = "Clay";
        idol1.idolPrice = 1500.50;
        idol1.idolColor = "Golden";
        idol1.idolHeight = "20cm";
        idol1.idolWidth = "10cm";
        idol1.idolWeight = "500g";
        idol1.idolBrand = "CraftIndia";
        idol1.idolType = "Decorative";
        idol1.isNew = true;
        idol1.isFragile = true;
        idol1.idolCountry = "India";
        idol1.idolCompany = "Craft Works";
        idol1.idolStock = 25;
        idol1.idolCategory = "Religious";
        idol1.idolShape = "Sitting";
        idol1.idolFinish = "Glossy";
        idol1.idolCode = "ID101";
        idol1.idolRemark = "Festival Special";
        idol1.idolManufactureDate = "01-01-2026";
        idol1.idolExpiryDate = "01-01-2035";
        idol1.idolUse = "Pooja";
        idol1.idolQuality = "Premium";
        idol1.idolPackageType = "Box";

        System.out.println("Idol Id: " + idol1.idolId);
        System.out.println("Idol Name: " + idol1.idolName);
        System.out.println("Idol Price: " + idol1.idolPrice);
        System.out.println("Idol Color: " + idol1.idolColor);
        System.out.println("Idol Material: " + idol1.idolMaterial);

        System.out.println("After Execution");
    }
}