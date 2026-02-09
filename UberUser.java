class UberUser {
	static void saveUserAccount(String phoneNumber, String rideType,int ridesCompleted, double rating)
{	
System.out.println("Phone Number: " + phoneNumber);
System.out.println("Ride Type: " + rideType);
System.out.println("Rides Completed: " + ridesCompleted);
System.out.println("Rating: " + rating);
}
public static void main(String[] uber){
saveUserAccount("9535267077","Mini", 120, 4.8);
}
}
