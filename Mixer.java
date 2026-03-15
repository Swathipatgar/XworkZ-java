class Mixer {

    static boolean isSwitched;
    int currentSpeed;
    static int maxSpeed = 3;   

    static boolean onOrOff() {

        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Mixer is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Mixer is switched Off...");
        }

        return isSwitched;
    }

    public void increaseSpeed() {

        System.out.println("increaseSpeed is invoked...");

        if (isSwitched) {

            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Current Speed Level: " + currentSpeed);
            } else {
                System.out.println("Maximum Speed Reached...");
            }

        } else {
            System.out.println("Please switch On the Mixer first...");
        }
    }

    public void decreaseSpeed() {

        System.out.println("decreaseSpeed is invoked...");

        if (isSwitched) {

            if (currentSpeed > 0) {
                currentSpeed--;
                System.out.println("Current Speed Level: " + currentSpeed);
            } else {
                System.out.println("Speed is already at Minimum...");
            }

        } else {
            System.out.println("Please switch On the Mixer first...");
        }
    }
}
