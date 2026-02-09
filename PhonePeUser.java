class PhonePeUser {
	static void saveUserAccount(String mobileNumber,String bankLinked ,boolean upiActive,double balance)
	{
System.out.println("Mobile Number: " + mobileNumber);
System.out.println("Bank Linked: " + bankLinked);
System.out.println("UPI Active: " + upiActive);
System.out.println("Balance: " + balance);
}	
public static void main(String[] phonepe){
saveUserAccount("9535267077", "BOB", true, 500000.50);
}
}