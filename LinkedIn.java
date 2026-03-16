class LinkedIn{

	int users;
	int companies;
	int recruiters;
	int jobPosts;
	int jobSearch;
	int messaging;
	int networking;
	int learning;
	int premiumAccounts;
	int events;
	int groups;
	int newsletters;
	int analytics;
	int hiring;
	int branding;
	int marketing;
	int engagement;
	int traffic;
	int ads;
	int updates;

	Profile profile;

	public void displayLinkedInDetails(){

		this.profile.displayProfileDetails();

		System.out.println("Users: "+users);
		System.out.println("Companies: "+companies);
		System.out.println("Recruiters: "+recruiters);
		System.out.println("Job Posts: "+jobPosts);
		System.out.println("Job Search: "+jobSearch);
		System.out.println("Messaging: "+messaging);
		System.out.println("Networking: "+networking);
		System.out.println("Learning: "+learning);
		System.out.println("Premium Accounts: "+premiumAccounts);
		System.out.println("Events: "+events);
		System.out.println("Groups: "+groups);
		System.out.println("Newsletters: "+newsletters);
		System.out.println("Analytics: "+analytics);
		System.out.println("Hiring: "+hiring);
		System.out.println("Branding: "+branding);
		System.out.println("Marketing: "+marketing);
		System.out.println("Engagement: "+engagement);
		System.out.println("Traffic: "+traffic);
		System.out.println("Ads: "+ads);
		System.out.println("Updates: "+updates);

	}
}