class LaptopExecutor {

    public static void main(String[] args) {

        Laptop.onOrOff();   

        Laptop lap = new Laptop();

        lap.increaseBrightness();
        lap.increaseBrightness();
        lap.decreaseBrightness();
        Laptop.onOrOff();   
    }
}
