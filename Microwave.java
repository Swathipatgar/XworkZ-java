class Microwave {
    static boolean isSwitched;
    static boolean onOrOff() {
        if (isSwitched) {
            isSwitched = true;
            System.out.println("The Microwave is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Microwave is switched Off...");
        }
        return isSwitched;
    }
}
