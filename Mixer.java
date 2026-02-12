class Mixer {
    static boolean isSwitched;

    static boolean onOrOff() {
        if (!isSwitched) {
            isSwitched = true;
            System.out.println("The Mixer is switched On...");
        } else {
            isSwitched = false;
            System.out.println("The Mixer is switched Off...");
        }
        return isSwitched;
    }
}
