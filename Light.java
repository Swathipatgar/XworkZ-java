class Light {

    static boolean isSwitched;
    int currentBrightness;
    static int maxBrightness = 5;

    static boolean onOrOff() {

        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Light is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Light is switched Off...");
        }

        return isSwitched;
    }

    public void increaseBrightness() {

        System.out.println("increaseBrightness is invoked...");

        if (isSwitched) {

            if (currentBrightness < maxBrightness) {
                currentBrightness++;
                System.out.println("Current Brightness Level: " + currentBrightness);
            } else {
                System.out.println("Maximum Brightness Reached...");
            }

        } else {
            System.out.println("Please switch On the Light first...");
        }
    }

    public void decreaseBrightness() {

        System.out.println("decreaseBrightness is invoked...");

        if (isSwitched) {

            if (currentBrightness > 0) {
                currentBrightness--;
                System.out.println("Current Brightness Level: " + currentBrightness);
            } else {
                System.out.println("Brightness is already at Minimum...");
            }

        } else {
            System.out.println("Please switch On the Light first...");
        }
    }
}
