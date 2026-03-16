class NewsPaper{

	int pages;
	int price;
	int circulation;
	int editors;
	int reporters;
	int photographers;
	int printingMachines;
	int distribution;
	int advertisements;
	int subscribers;
	int onlineReaders;
	int dailyEdition;
	int weeklyEdition;
	int monthlyEdition;
	int languages;
	int branches;
	int newsSections;
	int publishingYear;
	int headquarters;
	int rating;

	Article article;

	public void displayNewsPaperDetails(){

		this.article.displayArticleDetails();

		System.out.println("Pages: "+pages);
		System.out.println("Price: "+price);
		System.out.println("Circulation: "+circulation);
		System.out.println("Editors: "+editors);
		System.out.println("Reporters: "+reporters);
		System.out.println("Photographers: "+photographers);
		System.out.println("Printing Machines: "+printingMachines);
		System.out.println("Distribution: "+distribution);
		System.out.println("Advertisements: "+advertisements);
		System.out.println("Subscribers: "+subscribers);
		System.out.println("Online Readers: "+onlineReaders);
		System.out.println("Daily Edition: "+dailyEdition);
		System.out.println("Weekly Edition: "+weeklyEdition);
		System.out.println("Monthly Edition: "+monthlyEdition);
		System.out.println("Languages: "+languages);
		System.out.println("Branches: "+branches);
		System.out.println("News Sections: "+newsSections);
		System.out.println("Publishing Year: "+publishingYear);
		System.out.println("Headquarters: "+headquarters);
		System.out.println("Rating: "+rating);

	}
}