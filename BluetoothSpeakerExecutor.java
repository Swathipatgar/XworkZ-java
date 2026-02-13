class BluetoothSpeakerExecutor {
    public static void main(String[] args) {

        double price = BluetoothSpeaker.getPrice();
        String brand = BluetoothSpeaker.getBrand();
        int battery = BluetoothSpeaker.getBatteryLife();
        int power = BluetoothSpeaker.getOutputPower();
        boolean waterproof = BluetoothSpeaker.hasWaterproof();

        System.out.println("Brand of the speaker: " + brand);
        System.out.println("Price of the speaker: " + price);
        System.out.println("Battery Life: " + battery + " Hours");
        System.out.println("Output Power: " + power + " Watts");
        System.out.println("Waterproof: " + waterproof);
    }
}
