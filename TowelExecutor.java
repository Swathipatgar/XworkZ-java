class TowelExecutor {

    public static void main(String[] args) {

        System.out.println("Before Execution");

        Towel towel1 = new Towel();

        towel1.towelId = 1;
        towel1.towelBrand = "Bombay Dyeing";
        towel1.towelColor = "Blue";
        towel1.towelPrice = 499.99;
        towel1.towelType = "Bath";
        towel1.towelMaterial = "Cotton";
        towel1.isSoft = true;
        towel1.isNew = true;
        towel1.towelCountry = "India";
        towel1.towelCompany = "Bombay Dyeing Ltd";
        towel1.towelStock = 100;
        towel1.towelCategory = "Bathroom";
        towel1.towelModel = "BT100";
        towel1.towelWeight = "300g";
        towel1.towelWidth = "60cm";
        towel1.towelLength = "120cm";
        towel1.towelManufactureDate = "10-01-2026";
        towel1.towelExpiryDate = "10-01-2030";
        towel1.towelCode = "TW001";
        towel1.towelFinish = "Soft";
        towel1.towelRemark = "Highly Absorbent";
        towel1.towelStyle = "Plain";
        towel1.towelUse = "Bathing";
        towel1.towelQuality = "Premium";
        towel1.towelShape = "Rectangle";

        System.out.println("Towel Id: " + towel1.towelId);
        System.out.println("Towel Brand: " + towel1.towelBrand);
        System.out.println("Towel Price: " + towel1.towelPrice);
        System.out.println("Towel Color: " + towel1.towelColor);

        System.out.println("After Execution");
    }
}