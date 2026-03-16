class Profile{

	int profileId;
	int followers;
	int connections;
	int posts;
	int likes;
	int comments;
	int shares;
	int skills;
	int endorsements;
	int experience;
	int education;
	int certifications;
	int projects;
	int achievements;
	int recommendations;
	int profileViews;
	int messages;
	int notifications;
	int jobApplications;
	int savedJobs;

	public void displayProfileDetails(){

		System.out.println("Profile Id: "+profileId);
		System.out.println("Followers: "+followers);
		System.out.println("Connections: "+connections);
		System.out.println("Posts: "+posts);
		System.out.println("Likes: "+likes);
		System.out.println("Comments: "+comments);
		System.out.println("Shares: "+shares);
		System.out.println("Skills: "+skills);
		System.out.println("Endorsements: "+endorsements);
		System.out.println("Experience: "+experience);
		System.out.println("Education: "+education);
		System.out.println("Certifications: "+certifications);
		System.out.println("Projects: "+projects);
		System.out.println("Achievements: "+achievements);
		System.out.println("Recommendations: "+recommendations);
		System.out.println("Profile Views: "+profileViews);
		System.out.println("Messages: "+messages);
		System.out.println("Notifications: "+notifications);
		System.out.println("Job Applications: "+jobApplications);
		System.out.println("Saved Jobs: "+savedJobs);
	}
}