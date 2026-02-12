class AirConditioner {
    static boolean isSwitched;
    static boolean onOrOff() {
        if (isSwitched) {
            isSwitched = true;
            System.out.println("The Air Conditioner is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Air Conditioner is switched Off...");
        }
        return isSwitched;
    }
}
