class AquariumExecutor {

public static void main(String[] args){

System.out.println("Before Execution");

Aquarium aquarium1 = new Aquarium();

aquarium1.aquariumId = 1;
aquarium1.aquariumBrand = "AquaWorld";
aquarium1.aquariumColor = "Transparent";
aquarium1.aquariumPrice = 4500.50;
aquarium1.aquariumType = "Glass Tank";
aquarium1.aquariumMaterial = "Glass";
aquarium1.isClean = true;
aquarium1.isNew = true;
aquarium1.aquariumCountry = "India";
aquarium1.aquariumCompany = "Aqua Pvt Ltd";
aquarium1.aquariumStock = 15;
aquarium1.aquariumCategory = "Pet";
aquarium1.aquariumModel = "AQ100";
aquarium1.aquariumWeight = "8kg";
aquarium1.aquariumWidth = "50cm";
aquarium1.aquariumLength = "80cm";
aquarium1.aquariumManufactureDate = "10-02-2026";
aquarium1.aquariumExpiryDate = "10-02-2035";
aquarium1.aquariumCode = "AQ001";
aquarium1.aquariumFinish = "Glossy";
aquarium1.aquariumRemark = "Best Quality";
aquarium1.aquariumStyle = "Modern";
aquarium1.aquariumUse = "Fish Keeping";
aquarium1.aquariumQuality = "Premium";
aquarium1.aquariumShape = "Rectangle";

System.out.println("Aquarium Id: " + aquarium1.aquariumId);
System.out.println("Aquarium Brand: " + aquarium1.aquariumBrand);
System.out.println("Aquarium Price: " + aquarium1.aquariumPrice);

System.out.println("After Execution");

}
}