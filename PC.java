class PC{

	int gamingPC;
	int officePC;
	int personalPC;
	int workstationPC;
	int desktopPC;
	int miniPC;
	int customPC;
	int allInOnePC;
	int multimediaPC;
	int businessPC;
	int studentPC;
	int developerPC;
	int serverPC;
	int editingPC;
	int streamingPC;
	int graphicDesignPC;
	int programmingPC;
	int testingPC;
	int engineeringPC;
	int homePC;

	Hardware hardware;

	public void displayPCDetails(){

		this.hardware.displayHardwareDetails();

		System.out.println("Gaming PC: "+gamingPC);
		System.out.println("Office PC: "+officePC);
		System.out.println("Personal PC: "+personalPC);
		System.out.println("Workstation PC: "+workstationPC);
		System.out.println("Desktop PC: "+desktopPC);
		System.out.println("Mini PC: "+miniPC);
		System.out.println("Custom PC: "+customPC);
		System.out.println("All In One PC: "+allInOnePC);
		System.out.println("Multimedia PC: "+multimediaPC);
		System.out.println("Business PC: "+businessPC);
		System.out.println("Student PC: "+studentPC);
		System.out.println("Developer PC: "+developerPC);
		System.out.println("Server PC: "+serverPC);
		System.out.println("Editing PC: "+editingPC);
		System.out.println("Streaming PC: "+streamingPC);
		System.out.println("Graphic Design PC: "+graphicDesignPC);
		System.out.println("Programming PC: "+programmingPC);
		System.out.println("Testing PC: "+testingPC);
		System.out.println("Engineering PC: "+engineeringPC);
		System.out.println("Home PC: "+homePC);

	}
}