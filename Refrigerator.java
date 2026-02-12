class Refrigerator {
    static boolean isSwitched;

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
}
