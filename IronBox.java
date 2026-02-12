class IronBox {
    static boolean isSwitched;
    static boolean onOrOff() {
        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Iron Box is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Iron Box is switched Off...");
        }
        return isSwitched;
    }
}
