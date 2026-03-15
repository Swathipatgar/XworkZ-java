class AirConditioner {

    static boolean isSwitched;
    int currentTemperature = 24;  
    static int minTemperature = 16;
    static int maxTemperature = 30;

    static boolean onOrOff() {

        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Air Conditioner is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Air Conditioner is switched Off...");
        }

        return isSwitched;
    }

    public void increaseTemperature() {

        System.out.println("increaseTemperature is invoked...");

        if (isSwitched) {

            if (currentTemperature < maxTemperature) {
                currentTemperature++;
                System.out.println("Current Temperature is: " + currentTemperature);
            } else {
                System.out.println("Maximum Temperature Reached...");
            }

        } else {
            System.out.println("Please switch On the AC first...");
        }
    }

    public void decreaseTemperature() {

        System.out.println("decreaseTemperature is invoked...");

        if (isSwitched) {

            if (currentTemperature > minTemperature) {
                currentTemperature--;
                System.out.println("Current Temperature is: " + currentTemperature);
            } else {
                System.out.println("Minimum Temperature Reached...");
            }

        } else {
            System.out.println("Please switch On the AC first...");
        }
    }
}
