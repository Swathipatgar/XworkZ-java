class IplRunner{

	public static void main(String[] args){

		Ipl ipl = new Ipl();

		ipl.rcb = 1;
		ipl.csk = 2;
		ipl.mi = 3;
		ipl.kkr = 4;
		ipl.srh = 5;
		ipl.rr = 6;
		ipl.dc = 7;
		ipl.lsg = 8;
		ipl.gt = 9;
		ipl.pbks = 10;
		ipl.season1 = 11;
		ipl.season2 = 12;
		ipl.season3 = 13;
		ipl.season4 = 14;
		ipl.season5 = 15;
		ipl.season6 = 16;
		ipl.season7 = 17;
		ipl.season8 = 18;
		ipl.season9 = 19;
		ipl.season10 = 20;


		Player player = new Player();

		player.viratKohli = 1;
		player.rohitSharma = 2;
		player.msDhoni = 3;
		player.klRahul = 4;
		player.hardikPandya = 5;
		player.suryaKumarYadav = 6;
		player.shubmanGill = 7;
		player.jaspritBumrah = 8;
		player.ravindraJadeja = 9;
		player.rishabhPant = 10;
		player.benStokes = 11;
		player.davidWarner = 12;
		player.kaneWilliamson = 13;
		player.josButtler = 14;
		player.glennMaxwell = 15;
		player.andreRussell = 16;
		player.quintonDeKock = 17;
		player.fafDuPlessis = 18;
		player.patCummins = 19;
		player.mitchellStarc = 20;

		ipl.player = player;

		ipl.displayIplDetails();
	}
}