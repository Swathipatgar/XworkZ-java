class MixerExecutor {

    public static void main(String[] args) {

        Mixer.onOrOff();   // Turn ON

        Mixer mixer = new Mixer();

        mixer.increaseSpeed();
        mixer.increaseSpeed();
        mixer.increaseSpeed();
        mixer.increaseSpeed();  // Max check

        mixer.decreaseSpeed();

        Mixer.onOrOff();   // Turn OFF
    }
}
