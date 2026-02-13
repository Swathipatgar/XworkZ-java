class IronBox {

    static boolean isSwitched;
    int currentHeatLevel;
    static int maxHeatLevel = 5;   

    static boolean onOrOff() {

        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Iron Box is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Iron Box is switched Off...");
        }

        return isSwitched;
    }

    public void increaseHeat() {

        System.out.println("increaseHeat is invoked...");

        if (isSwitched) {

            if (currentHeatLevel < maxHeatLevel) {
                currentHeatLevel++;
                System.out.println("Current Heat Level: " + currentHeatLevel);
            } else {
                System.out.println("Maximum Heat Level Reached...");
            }

        } else {
            System.out.println("Please switch On the Iron Box first...");
        }
    }

    public void decreaseHeat() {

        System.out.println("decreaseHeat is invoked...");

        if (isSwitched) {

            if (currentHeatLevel > 0) {
                currentHeatLevel--;
                System.out.println("Current Heat Level: " + currentHeatLevel);
            } else {
                System.out.println("Heat Level is already at Minimum...");
            }

        } else {
            System.out.println("Please switch On the Iron Box first...");
        }
    }
}
