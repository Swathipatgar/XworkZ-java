class PCRunner{

	public static void main(String[] args){

		PC pc = new PC();

		pc.gamingPC = 1;
		pc.officePC = 2;
		pc.personalPC = 3;
		pc.workstationPC = 4;
		pc.desktopPC = 5;
		pc.miniPC = 6;
		pc.customPC = 7;
		pc.allInOnePC = 8;
		pc.multimediaPC = 9;
		pc.businessPC = 10;
		pc.studentPC = 11;
		pc.developerPC = 12;
		pc.serverPC = 13;
		pc.editingPC = 14;
		pc.streamingPC = 15;
		pc.graphicDesignPC = 16;
		pc.programmingPC = 17;
		pc.testingPC = 18;
		pc.engineeringPC = 19;
		pc.homePC = 20;


		Hardware hardware = new Hardware();

		hardware.processor = 1;
		hardware.motherboard = 2;
		hardware.ram = 3;
		hardware.hardDisk = 4;
		hardware.ssd = 5;
		hardware.graphicCard = 6;
		hardware.powerSupply = 7;
		hardware.cabinet = 8;
		hardware.cpuFan = 9;
		hardware.monitor = 10;
		hardware.keyboard = 11;
		hardware.mouse = 12;
		hardware.speakers = 13;
		hardware.webcam = 14;
		hardware.wifiCard = 15;
		hardware.bluetoothAdapter = 16;
		hardware.dvdDrive = 17;
		hardware.soundCard = 18;
		hardware.coolingSystem = 19;
		hardware.networkCard = 20;

		pc.hardware = hardware;

		pc.displayPCDetails();
	}
}