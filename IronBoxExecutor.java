class IronBoxExecutor {

    public static void main(String[] args) {

        IronBox.onOrOff();   

        IronBox iron = new IronBox();

        iron.increaseHeat();
        iron.increaseHeat();
        iron.decreaseHeat();

        IronBox.onOrOff();   
    }
}
