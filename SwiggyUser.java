class SwiggyUser {
	static void saveUserAccount(String phoneNumber,String address, int deliveries,boolean instamartUser )
	{
System.out.println("Phone Number: " + phoneNumber);
System.out.println("Address: " + address);
System.out.println("Deliveries: " + deliveries);
System.out.println("Instamart User: " + instamartUser);
}
		
public static void main(String[] swiggy){
	saveUserAccount("9535267077", "Rajajinagara",55, true);

}
}
