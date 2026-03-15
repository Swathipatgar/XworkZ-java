class ShampooExecutor {

public static void main(String[] args){

System.out.println("Before Execution");

Shampoo shampoo1 = new Shampoo();

shampoo1.shampooId = 1;
shampoo1.shampooBrand = "Clinic Plus";
shampoo1.shampooColor = "Blue";
shampoo1.shampooPrice = 250.75;
shampoo1.shampooType = "Hair Care";
shampoo1.shampooMaterial = "Liquid";
shampoo1.isOrganic = true;
shampoo1.isNew = true;
shampoo1.shampooCountry = "India";
shampoo1.shampooCompany = "HUL";
shampoo1.shampooStock = 100;
shampoo1.shampooCategory = "Cosmetics";
shampoo1.shampooModel = "CP100";
shampoo1.shampooWeight = "180ml";
shampoo1.shampooWidth = "5cm";
shampoo1.shampooLength = "15cm";
shampoo1.shampooManufactureDate = "05-02-2026";
shampoo1.shampooExpiryDate = "05-02-2028";
shampoo1.shampooCode = "SH001";
shampoo1.shampooFinish = "Smooth";
shampoo1.shampooRemark = "Popular Brand";
shampoo1.shampooStyle = "Regular";
shampoo1.shampooUse = "Hair Wash";
shampoo1.shampooQuality = "Good";
shampoo1.shampooShape = "Bottle";

System.out.println("Shampoo Id: " + shampoo1.shampooId);
System.out.println("Shampoo Brand: " + shampoo1.shampooBrand);
System.out.println("Shampoo Price: " + shampoo1.shampooPrice);

System.out.println("After Execution");

}
}