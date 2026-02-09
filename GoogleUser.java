class GoogleUser {
static void saveUserAccount(String gmail,boolean twoStepVerification,String recoveryEmail,String loginDevice,int storageUsedGB)
{
System.out.println("Gmail: " + gmail);
System.out.println("2-Step Verification: " + twoStepVerification);
System.out.println("Recovery Email: " + recoveryEmail);
System.out.println("Login Device: " + loginDevice);
System.out.println("Storage Used: " + storageUsedGB + "GB");
}
public static void main(String[] google){
saveUserAccount( "swathi@gmail.com", true, "backup@gmail.com","Mobile",10);
}
}
