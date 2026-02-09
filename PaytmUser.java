class PaytmUser {
static void saveUserAccount(String mobileNumber,double walletBalance, boolean kycCompleted,String loginMethod)
{
System.out.println("Mobile Number: " + mobileNumber);
System.out.println("Wallet Balance: " + walletBalance);
System.out.println("KYC Completed: " + kycCompleted);
System.out.println("Login Method: " + loginMethod);
}

public static void main(String[] paytm){
saveUserAccount("9535267077", 560.75, true, "OTP");
}
}
