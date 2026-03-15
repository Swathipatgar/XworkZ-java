class Fan {
    static boolean isSwitched;
    int currentSpeed;           // Fan speed level
    static int maxSpeed = 5;    // Maximum speed

    static boolean onOrOff() {
        if (isSwitched == false) {
            isSwitched = true;
            System.out.println("The Fan is switched On");
        } else {
            isSwitched = false;
            System.out.println("The Fan is switched Off");
        }
        return isSwitched;
    }

    public void increaseSpeed() {
        System.out.println("increaseSpeed is invoked...");

        if (isSwitched) {

            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("Maximum Speed Reached...");
            }

        } else {
            System.out.println("Please switch On the Fan first...");
        }
    }

    public void decreaseSpeed() {

        System.out.println("decreaseSpeed is invoked...");

        if (isSwitched) {

            if (currentSpeed > 0) {
                currentSpeed--;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("Speed is already at Minimum...");
            }

        } else {
            System.out.println("Please switch On the Fan first...");
        }
    }
}
