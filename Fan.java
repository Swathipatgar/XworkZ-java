class Fan {
    static boolean isSwitched;
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
}
