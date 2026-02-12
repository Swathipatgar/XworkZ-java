class WashingMachine {
    static boolean isSwitched;
    static boolean onOrOff() {
        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Washing Machine is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Washing Machine is switched Off...");
        }
        return isSwitched;
    }
}
