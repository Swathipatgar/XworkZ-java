class ZomatoUser {
	static void saveUserAccount(String email,String location,boolean goldMember,int ordersCount)
	{
System.out.println("Email: " + email);
System.out.println("Location: " + location);
System.out.println("Gold Member: " + goldMember);
System.out.println("Orders Count: " + ordersCount);
}		
public static void main(String[] zomato){
saveUserAccount("swathi@gmail.com","Bangalore",false,40);
}
}
