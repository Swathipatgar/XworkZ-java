class Heater {
    static boolean isSwitched;

    static boolean onOrOff() {
        if (isSwitched) {
            isSwitched = true;
            System.out.println("The Heater is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Heater is switched Off...");
        }
        return isSwitched;
    }
}
