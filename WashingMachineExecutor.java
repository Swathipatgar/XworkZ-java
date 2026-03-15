class WashingMachineExecutor {
public static void main(String[] args){
System.out.println("Before Execution");
WashingMachine wm1 = new WashingMachine();

wm1.washingMachineId = 1;
wm1.washingMachineBrand = "LG";
wm1.washingMachineColor = "White";
wm1.washingMachinePrice = 25000.99;
wm1.washingMachineType = "Front Load";
wm1.washingMachineMaterial = "Steel";
wm1.isWorking = true;
wm1.isNew = true;
wm1.washingMachineCountry = "India";
wm1.washingMachineCompany = "LG Pvt Ltd";
wm1.washingMachineStock = 10;
wm1.washingMachineCategory = "Home Appliance";
wm1.washingMachineModel = "LG100";
wm1.washingMachineWeight = "50kg";
wm1.washingMachineWidth = "60cm";
wm1.washingMachineLength = "85cm";
wm1.washingMachineManufactureDate = "05-02-2026";
wm1.washingMachineExpiryDate = "05-02-2035";
wm1.washingMachineCode = "WM001";
wm1.washingMachineFinish = "Glossy";
wm1.washingMachineRemark = "High Performance";
wm1.washingMachineStyle = "Modern";
wm1.washingMachineUse = "Laundry";
wm1.washingMachineQuality = "Premium";
wm1.washingMachineShape = "Rectangle";

System.out.println("WashingMachine Id: " + wm1.washingMachineId);
System.out.println("WashingMachine Brand: " + wm1.washingMachineBrand);

System.out.println("After Execution");

}
}