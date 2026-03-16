class Tv{

	int samsung;
	int lg;
	int sony;
	int mi;
	int onePlus;
	int panasonic;
	int philips;
	int tcl;
	int vu;
	int nokia;
	int led;
	int lcd;
	int oled;
	int smartTv;
	int androidTv;
	int hdTv;
	int fullHd;
	int ultraHd;
	int fourK;
	int curvedTv;

	Channel channel;

	public void displayTvDetails(){

		this.channel.displayChannelDetails();

		System.out.println("Samsung: "+samsung);
		System.out.println("LG: "+lg);
		System.out.println("Sony: "+sony);
		System.out.println("MI: "+mi);
		System.out.println("OnePlus: "+onePlus);
		System.out.println("Panasonic: "+panasonic);
		System.out.println("Philips: "+philips);
		System.out.println("TCL: "+tcl);
		System.out.println("VU: "+vu);
		System.out.println("Nokia: "+nokia);
		System.out.println("LED: "+led);
		System.out.println("LCD: "+lcd);
		System.out.println("OLED: "+oled);
		System.out.println("Smart TV: "+smartTv);
		System.out.println("Android TV: "+androidTv);
		System.out.println("HD TV: "+hdTv);
		System.out.println("Full HD: "+fullHd);
		System.out.println("Ultra HD: "+ultraHd);
		System.out.println("4K TV: "+fourK);
		System.out.println("Curved TV: "+curvedTv);

	}
}