class NetflixUser {
static void saveUserAccount(String email,String planType,int profilesCount,boolean autoRenewal, String loginMethod)
{
System.out.println("Email: " + email);
System.out.println("Plan Type: " + planType);
System.out.println("Profiles Count: " + profilesCount);
System.out.println("Auto Renewal: " + autoRenewal);
System.out.println("Login Method: " + loginMethod);
}	
public static void main(String[] netflix){
saveUserAccount("swathi@gmail.com","STANDARD", 4, true,"EMAIL");
}
}
