class DrierExecutor {

public static void main(String[] args){

System.out.println("Before Execution");

Drier drier1 = new Drier();

drier1.drierId = 1;
drier1.drierBrand = "Philips";
drier1.drierColor = "Black";
drier1.drierPrice = 1999.99;
drier1.drierType = "Hair Dryer";
drier1.drierMaterial = "Plastic";
drier1.isWorking = true;
drier1.isNew = true;
drier1.drierCountry = "India";
drier1.drierCompany = "Philips Ltd";
drier1.drierStock = 20;
drier1.drierCategory = "Electronics";
drier1.drierModel = "DR100";
drier1.drierWeight = "400g";
drier1.drierWidth = "10cm";
drier1.drierLength = "25cm";
drier1.drierManufactureDate = "12-02-2026";
drier1.drierExpiryDate = "12-02-2030";
drier1.drierCode = "DR001";
drier1.drierFinish = "Matte";
drier1.drierRemark = "Good Quality";
drier1.drierStyle = "Modern";
drier1.drierUse = "Hair Drying";
drier1.drierQuality = "Premium";
drier1.drierShape = "Handheld";

System.out.println("Drier Id: " + drier1.drierId);
System.out.println("Drier Brand: " + drier1.drierBrand);
System.out.println("Drier Price: " + drier1.drierPrice);

System.out.println("After Execution");

}
}