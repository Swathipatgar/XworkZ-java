class InstagramUser {
static void saveUserAccount(String username,String email,boolean isVerified,String loginMethod)
{
System.out.println("Username is " + username);
System.out.println("Email is " + email);
System.out.println("Account verified: " + isVerified);
System.out.println("Login method: " + loginMethod);
}		
public static void main(String[] insta){
saveUserAccount("swathi_p","swathi@gmail.com", true, "EMAIL");
}
}
