class SnapchatUser {
static void saveUserAccount(String username,int snapScore, boolean locationEnabled , int friendsCount)
{
System.out.println("Username: " + username);
System.out.println("Snap Score: " + snapScore);
System.out.println("Location Enabled: " + locationEnabled);
System.out.println("Friends Count: " + friendsCount);
}
public static void main(String[] snap)
{
	saveUserAccount("swathi_snap",12000,true,180);
}	
}
