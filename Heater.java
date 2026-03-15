class Heater {

    static boolean isSwitched;
    int currentLevel;          
    static int maxLevel = 5;    

    static boolean onOrOff() {

        if (!isSwitched) {   
            isSwitched = true;
            System.out.println("The Heater is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Heater is switched Off...");
        }

        return isSwitched;
    }

    public void increaseHeat() {

        System.out.println("increaseHeat is invoked...");

        if (isSwitched) {

            if (currentLevel < maxLevel) {
                currentLevel++;
                System.out.println("Current Heat Level: " + currentLevel);
            } else {
                System.out.println("Maximum Heat Level Reached...");
            }

        } else {
            System.out.println("Please switch On the Heater first...");
        }
    }

    public void decreaseHeat() {

        System.out.println("decreaseHeat is invoked...");

        if (isSwitched) {

            if (currentLevel > 0) {
                currentLevel--;
                System.out.println("Current Heat Level: " + currentLevel);
            } else {
                System.out.println("Heat Level is already at Minimum...");
            }

        } else {
            System.out.println("Please switch On the Heater first...");
        }
    }
}
