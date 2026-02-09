class LinkedInUser {
	static void saveUserAccount(String email,String profession,int connections,boolean openToWork)
	{
System.out.println("Email: " + email);
System.out.println("Profession: " + profession);
System.out.println("Connections: " + connections);
System.out.println("Open to Work: " + openToWork);
	}
public static void main(String[] args){
	saveUserAccount("swathi@gmail.com","Student",500, true);
}
}
