class BulbExecutor {
    public static void main(String[] args) {
        System.out.println("Before Execution");
        Bulb bulb1 = new Bulb();

        bulb1.bulbId = 1;
        bulb1.bulbBrand = "Philips";
        bulb1.bulbType = "LED";
        bulb1.bulbColor = "White";
        bulb1.bulbPrice = 199.99;
        bulb1.bulbWatt = 12;
        bulb1.bulbShape = "Round";
        bulb1.bulbMaterial = "Glass";
        bulb1.bulbBaseType = "B22";
        bulb1.isLed = true;
        bulb1.isEnergySaving = true;
        bulb1.bulbCountry = "India";
        bulb1.bulbCompany = "Philips India";
        bulb1.bulbStock = 100;
        bulb1.bulbCategory = "Lighting";
        bulb1.bulbModel = "PL123";
        bulb1.bulbFinish = "Matte";
        bulb1.bulbCode = "BLB001";
        bulb1.bulbRemark = "Energy Efficient";
        bulb1.bulbManufactureDate = "10-01-2026";
        bulb1.bulbExpiryDate = "10-01-2030";
        bulb1.bulbUse = "Home Lighting";
        bulb1.bulbQuality = "Premium";
        bulb1.bulbVoltage = "220V";
        bulb1.bulbPackageType = "Box";

        System.out.println("Bulb Id: " + bulb1.bulbId);
        System.out.println("Bulb Brand: " + bulb1.bulbBrand);
        System.out.println("Bulb Price: " + bulb1.bulbPrice);
        System.out.println("Bulb Watt: " + bulb1.bulbWatt);
        System.out.println("Bulb Color: " + bulb1.bulbColor);

        System.out.println("After Execution");
    }
}