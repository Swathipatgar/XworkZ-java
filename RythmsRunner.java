class RythmsRunner{

	public static void main(String[] args){

		Rythms rythms = new Rythms();

		rythms.classical = 1;
		rythms.rock = 2;
		rythms.pop = 3;
		rythms.jazz = 4;
		rythms.folk = 5;
		rythms.hiphop = 6;
		rythms.blues = 7;
		rythms.electronic = 8;
		rythms.country = 9;
		rythms.reggae = 10;
		rythms.fusion = 11;
		rythms.instrumental = 12;
		rythms.devotional = 13;
		rythms.melody = 14;
		rythms.fastBeat = 15;
		rythms.slowBeat = 16;
		rythms.danceBeat = 17;
		rythms.partyBeat = 18;
		rythms.festivalBeat = 19;
		rythms.emotionalBeat = 20;

		MusicInstrument musicInstrument = new MusicInstrument();

		musicInstrument.guitar = 1;
		musicInstrument.piano = 2;
		musicInstrument.violin = 3;
		musicInstrument.drums = 4;
		musicInstrument.flute = 5;
		musicInstrument.saxophone = 6;
		musicInstrument.trumpet = 7;
		musicInstrument.tabla = 8;
		musicInstrument.mridangam = 9;
		musicInstrument.harmonium = 10;
		musicInstrument.sitar = 11;
		musicInstrument.veena = 12;
		musicInstrument.keyboard = 13;
		musicInstrument.dhol = 14;
		musicInstrument.tambourine = 15;
		musicInstrument.clarinet = 16;
		musicInstrument.cello = 17;
		musicInstrument.bassGuitar = 18;
		musicInstrument.ukulele = 19;
		musicInstrument.congo = 20;

		rythms.musicInstrument = musicInstrument;

		rythms.displayRythmsDetails();
	}
}