class TwitterUser {
	static void saveUserAccount(String username,char gender, boolean isVerified, int followers)
{
System.out.println("Username: " + username);
System.out.println("Gender: " + gender);
System.out.println("Verified: " + isVerified);
System.out.println("Followers: " + followers);
}

public static void main(String[] twitter){
	saveUserAccount("Swathi",'F',true,400);	
}
}
