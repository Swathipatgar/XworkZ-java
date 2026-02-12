class Light {
    static boolean isSwitched;
    static boolean onOrOff() {
        if (isSwitched){
            isSwitched = true;
            System.out.println("The Light is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Light is switched Off...");
        }
        return isSwitched;
    }
}
