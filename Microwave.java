class Microwave {

    static boolean isSwitched;
    int currentTimer;           
    static int maxTimer = 30; 

    static boolean onOrOff() {

        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Microwave is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Microwave is switched Off...");
        }

        return isSwitched;
    }

    public void increaseTimer() {

        System.out.println("increaseTimer is invoked...");

        if (isSwitched) {

            if (currentTimer < maxTimer) {
                currentTimer++;
                System.out.println("Current Timer is: " + currentTimer + " minutes");
            } else {
                System.out.println("Maximum Timer Reached...");
            }

        } else {
            System.out.println("Please switch On the Microwave first...");
        }
    }

    public void decreaseTimer() {

        System.out.println("decreaseTimer is invoked...");

        if (isSwitched) {

            if (currentTimer > 0) {
                currentTimer--;
                System.out.println("Current Timer is: " + currentTimer + " minutes");
            } else {
                System.out.println("Timer is already at Minimum...");
            }

        } else {
            System.out.println("Please switch On the Microwave first...");
        }
    }
}
