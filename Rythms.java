class Rythms{

	int classical;
	int rock;
	int pop;
	int jazz;
	int folk;
	int hiphop;
	int blues;
	int electronic;
	int country;
	int reggae;
	int fusion;
	int instrumental;
	int devotional;
	int melody;
	int fastBeat;
	int slowBeat;
	int danceBeat;
	int partyBeat;
	int festivalBeat;
	int emotionalBeat;

	MusicInstrument musicInstrument;

	public void displayRythmsDetails(){

		this.musicInstrument.displayMusicInstrumentDetails();

		System.out.println("Classical: "+classical);
		System.out.println("Rock: "+rock);
		System.out.println("Pop: "+pop);
		System.out.println("Jazz: "+jazz);
		System.out.println("Folk: "+folk);
		System.out.println("HipHop: "+hiphop);
		System.out.println("Blues: "+blues);
		System.out.println("Electronic: "+electronic);
		System.out.println("Country: "+country);
		System.out.println("Reggae: "+reggae);
		System.out.println("Fusion: "+fusion);
		System.out.println("Instrumental: "+instrumental);
		System.out.println("Devotional: "+devotional);
		System.out.println("Melody: "+melody);
		System.out.println("Fast Beat: "+fastBeat);
		System.out.println("Slow Beat: "+slowBeat);
		System.out.println("Dance Beat: "+danceBeat);
		System.out.println("Party Beat: "+partyBeat);
		System.out.println("Festival Beat: "+festivalBeat);
		System.out.println("Emotional Beat: "+emotionalBeat);

	}
}