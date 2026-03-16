class DanceRunner{

	public static void main(String[] args){

		Dance dance = new Dance();

		dance.classicalDance = 1;
		dance.westernDance = 2;
		dance.indianDance = 3;
		dance.modernDance = 4;
		dance.folkDance = 5;
		dance.culturalDance = 6;
		dance.stageDance = 7;
		dance.groupDance = 8;
		dance.soloDance = 9;
		dance.duetDance = 10;
		dance.festivalDance = 11;
		dance.weddingDance = 12;
		dance.competitionDance = 13;
		dance.collegeDance = 14;
		dance.tvShowDance = 15;
		dance.movieDance = 16;
		dance.templeDance = 17;
		dance.streetDance = 18;
		dance.schoolDance = 19;
		dance.practiceDance = 20;

		Form form = new Form();

		form.bharatanatyam = 1;
		form.kathak = 2;
		form.kuchipudi = 3;
		form.odissi = 4;
		form.manipuri = 5;
		form.kathakali = 6;
		form.mohiniyattam = 7;
		form.sattriya = 8;
		form.chhau = 9;
		form.yakshagana = 10;
		form.folkDance = 11;
		form.hipHop = 12;
		form.ballet = 13;
		form.salsa = 14;
		form.tango = 15;
		form.contemporary = 16;
		form.breakDance = 17;
		form.jazz = 18;
		form.tapDance = 19;
		form.streetDance = 20;

		dance.form = form;

		dance.displayDanceDetails();
	}
}