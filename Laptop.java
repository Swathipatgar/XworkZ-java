class Laptop {

    static boolean isSwitched;
    int currentBrightness = 50;  
    static int maxBrightness = 100;
    static int minBrightness = 0;

    static boolean onOrOff() {

        if (!isSwitched) {   
            isSwitched = true;
            System.out.println("The Laptop is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Laptop is switched Off...");
        }

        return isSwitched;
    }

    public void increaseBrightness() {

        System.out.println("increaseBrightness is invoked...");

        if (isSwitched) {

            if (currentBrightness < maxBrightness) {
                currentBrightness += 10;
                System.out.println("Current Brightness: " + currentBrightness);
            } else {
                System.out.println("Maximum Brightness Reached...");
            }

        } else {
            System.out.println("Please switch On the Laptop first...");
        }
    }

    public void decreaseBrightness() {

        System.out.println("decreaseBrightness is invoked...");

        if (isSwitched) {

            if (currentBrightness > minBrightness) {
                currentBrightness -= 10;
                System.out.println("Current Brightness: " + currentBrightness);
            } else {
                System.out.println("Minimum Brightness Reached...");
            }

        } else {
            System.out.println("Please switch On the Laptop first...");
        }
    }
}
