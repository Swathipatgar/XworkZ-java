class AmazonUser {
	static void saveUserAccount(String email,boolean primeMember,String paymentMethod,int ordersPlaced, String loginMethod)
	{
System.out.println("Email: " + email);
System.out.println("Prime Member: " + primeMember);
System.out.println("Payment Method: " + paymentMethod);
System.out.println("Orders Placed: " + ordersPlaced);
System.out.println("Login Method: " + loginMethod);
	}
public static void main(String[] amz){
	saveUserAccount("swathi@gmail.com", true,"UPI",25,"EMAIL");
}
}



