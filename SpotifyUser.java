class SpotifyUser {
	static void saveUserAccount(String email,String subscriptionType,boolean isPremiumUser,String loginMethod,int playlistsCreated)
	{
System.out.println("Email: " + email);
System.out.println("Subscription Type: " + subscriptionType);
System.out.println("Premium User: " + isPremiumUser);
System.out.println("Login Method: " + loginMethod);
System.out.println("Playlists Created: " + playlistsCreated);
}
		
public static void main(String[] spotify){
	saveUserAccount("swathig@gmail.com","PREMIUM", true, "EMAIL",15);
}
}
