class TrainRunner{

	public static void main(String[] args){

		Train train = new Train();

		train.shatabdiExpress = 1;
		train.rajdhaniExpress = 2;
		train.durontoExpress = 3;
		train.vandeBharat = 4;
		train.garibRath = 5;
		train.intercityExpress = 6;
		train.tejasExpress = 7;
		train.doubleDecker = 8;
		train.janShatabdi = 9;
		train.samparkKranti = 10;
		train.hamsafarExpress = 11;
		train.utsavExpress = 12;
		train.superfastExpress = 13;
		train.passengerTrain = 14;
		train.goodsTrain = 15;
		train.metroTrain = 16;
		train.bulletTrain = 17;
		train.mountainRailway = 18;
		train.heritageTrain = 19;
		train.localTrain = 20;


		Bogie bogie = new Bogie();

		bogie.acCoach = 1;
		bogie.sleeperCoach = 2;
		bogie.generalCoach = 3;
		bogie.ladiesCoach = 4;
		bogie.pantryCoach = 5;
		bogie.luggageCoach = 6;
		bogie.chairCar = 7;
		bogie.executiveChairCar = 8;
		bogie.firstClass = 9;
		bogie.secondClass = 10;
		bogie.thirdAC = 11;
		bogie.secondAC = 12;
		bogie.guardCoach = 13;
		bogie.parcelCoach = 14;
		bogie.militaryCoach = 15;
		bogie.touristCoach = 16;
		bogie.doubleDeckerCoach = 17;
		bogie.vistadomeCoach = 18;
		bogie.metroCoach = 19;
		bogie.inspectionCoach = 20;

		train.bogie = bogie;

		train.displayTrainDetails();
	}
}