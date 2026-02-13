class Refrigerator {

    static boolean isSwitched;
    int currentCoolingLevel = 3;   // Default cooling level
    static int maxCoolingLevel = 7;
    static int minCoolingLevel = 1;

    static boolean onOrOff() {

        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Refrigerator is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Refrigerator is switched Off...");
        }

        return isSwitched;
    }

    public void increaseCooling() {

        System.out.println("increaseCooling is invoked...");

        if (isSwitched) {

            if (currentCoolingLevel < maxCoolingLevel) {
                currentCoolingLevel++;
                System.out.println("Current Cooling Level: " + currentCoolingLevel);
            } else {
                System.out.println("Maximum Cooling Level Reached...");
            }

        } else {
            System.out.println("Please switch On the Refrigerator first...");
        }
    }

    public void decreaseCooling() {

        System.out.println("decreaseCooling is invoked...");

        if (isSwitched) {

            if (currentCoolingLevel > minCoolingLevel) {
                currentCoolingLevel--;
                System.out.println("Current Cooling Level: " + currentCoolingLevel);
            } else {
                System.out.println("Minimum Cooling Level Reached...");
            }

        } else {
            System.out.println("Please switch On the Refrigerator first...");
        }
    }
}
