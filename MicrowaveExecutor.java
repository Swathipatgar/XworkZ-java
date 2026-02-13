class MicrowaveExecutor {

    public static void main(String[] args) {

        Microwave.onOrOff();  

        Microwave mw = new Microwave();

        mw.increaseTimer();
        mw.increaseTimer();
        mw.decreaseTimer();

        Microwave.onOrOff();  
    }
}
