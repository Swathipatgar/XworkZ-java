class FacebookUser {
	static void saveUserAccount(String emailOrPhone,String fullName,boolean isActive,String password,String loginType)
	{
		System.out.println("Email or Phone: " + emailOrPhone);
System.out.println("Full Name: " + fullName);
System.out.println("Account Active: " + isActive);
System.out.println("Password: " + password);
System.out.println("Login Type: " + loginType);
	}
public static void main(String[] facebook){
saveUserAccount("swathi1504@gmail.com","Swathi Patgar", true,"Fb@123", "EMAIL");
}
}
