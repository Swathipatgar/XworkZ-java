class NewsPaperRunner{

	public static void main(String[] args){

		NewsPaper paper = new NewsPaper();

		paper.pages = 1;
		paper.price = 2;
		paper.circulation = 3;
		paper.editors = 4;
		paper.reporters = 5;
		paper.photographers = 6;
		paper.printingMachines = 7;
		paper.distribution = 8;
		paper.advertisements = 9;
		paper.subscribers = 10;
		paper.onlineReaders = 11;
		paper.dailyEdition = 12;
		paper.weeklyEdition = 13;
		paper.monthlyEdition = 14;
		paper.languages = 15;
		paper.branches = 16;
		paper.newsSections = 17;
		paper.publishingYear = 18;
		paper.headquarters = 19;
		paper.rating = 20;

		Article article = new Article();

		article.politics = 1;
		article.sports = 2;
		article.business = 3;
		article.technology = 4;
		article.health = 5;
		article.education = 6;
		article.science = 7;
		article.environment = 8;
		article.entertainment = 9;
		article.lifestyle = 10;
		article.travel = 11;
		article.food = 12;
		article.culture = 13;
		article.opinion = 14;
		article.editorial = 15;
		article.interviews = 16;
		article.localNews = 17;
		article.internationalNews = 18;
		article.breakingNews = 19;
		article.specialReport = 20;

		paper.article = article;

		paper.displayNewsPaperDetails();
	}
}