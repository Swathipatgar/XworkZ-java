class LinkedInRunner{

	public static void main(String[] args){

		LinkedIn linkedin = new LinkedIn();

		linkedin.users = 1;
		linkedin.companies = 2;
		linkedin.recruiters = 3;
		linkedin.jobPosts = 4;
		linkedin.jobSearch = 5;
		linkedin.messaging = 6;
		linkedin.networking = 7;
		linkedin.learning = 8;
		linkedin.premiumAccounts = 9;
		linkedin.events = 10;
		linkedin.groups = 11;
		linkedin.newsletters = 12;
		linkedin.analytics = 13;
		linkedin.hiring = 14;
		linkedin.branding = 15;
		linkedin.marketing = 16;
		linkedin.engagement = 17;
		linkedin.traffic = 18;
		linkedin.ads = 19;
		linkedin.updates = 20;


		Profile profile = new Profile();

		profile.profileId = 1;
		profile.followers = 2;
		profile.connections = 3;
		profile.posts = 4;
		profile.likes = 5;
		profile.comments = 6;
		profile.shares = 7;
		profile.skills = 8;
		profile.endorsements = 9;
		profile.experience = 10;
		profile.education = 11;
		profile.certifications = 12;
		profile.projects = 13;
		profile.achievements = 14;
		profile.recommendations = 15;
		profile.profileViews = 16;
		profile.messages = 17;
		profile.notifications = 18;
		profile.jobApplications = 19;
		profile.savedJobs = 20;

		linkedin.profile = profile;

		linkedin.displayLinkedInDetails();
	}
}