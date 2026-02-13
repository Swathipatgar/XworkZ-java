class SmartSpeakerExecutor {
    public static void main(String[] speaker) {

        double price = SmartSpeaker.getPrice();
        String brand = SmartSpeaker.getBrand();
        String model = SmartSpeaker.getModel();
        boolean assistant = SmartSpeaker.isVoiceAssistantSupported();
        String connectivity = SmartSpeaker.getConnectivity();
        String color = SmartSpeaker.getColor();
        int warranty = SmartSpeaker.getWarrantyYears();
        boolean smartHome = SmartSpeaker.isSmartHomeControlSupported();
        double rating = SmartSpeaker.getRating();
        boolean prime = SmartSpeaker.isPrimeAvailable();

        System.out.println("Brand of the speaker: " + brand);
        System.out.println("Price of the speaker: " + price);
        System.out.println("Model: " + model);
        System.out.println("Voice Assistant: " + assistant);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Smart Home Control: " + smartHome);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
