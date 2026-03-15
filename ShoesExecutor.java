class ClockExecutor {
    public static void main(String[] args) {
        System.out.println("Before Execution");
        Clock clock1 = new Clock();

        clock1.clockId = 1;
        clock1.clockBrand = "Titan";
        clock1.clockColor = "Black";
        clock1.clockPrice = 1999.99;
        clock1.clockType = "Wall Clock";
        clock1.clockMaterial = "Plastic";
        clock1.isWorking = true;
        clock1.isNew = true;
        clock1.clockCountry = "India";
        clock1.clockCompany = "Titan Pvt Ltd";
        clock1.clockStock = 20;
        clock1.clockCategory = "Home";
        clock1.clockModel = "T100";
        clock1.clockWeight = "700g";
        clock1.clockWidth = "30cm";
        clock1.clockLength = "30cm";
        clock1.clockManufactureDate = "01-02-2026";
        clock1.clockExpiryDate = "01-02-2035";
        clock1.clockCode = "CL001";
        clock1.clockFinish = "Glossy";
        clock1.clockRemark = "Best Quality";
        clock1.clockStyle = "Modern";
        clock1.clockUse = "Home Decor";
        clock1.clockQuality = "Premium";
        clock1.clockShape = "Round";

        System.out.println("Clock Id: " + clock1.clockId);
        System.out.println("Clock Brand: " + clock1.clockBrand);
        System.out.println("Clock Price: " + clock1.clockPrice);
        System.out.println("Clock Color: " + clock1.clockColor);

        System.out.println("After Execution");
    }
}