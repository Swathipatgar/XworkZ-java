class WhatsAppUser {
static void saveUserAccount(String phoneNumber,boolean isOnline,String gmail, int contactsCount)
{
System.out.println("Phone Number: " + phoneNumber);
System.out.println("Online Status: " + isOnline);
System.out.println("gmail: " + gmail);
System.out.println("Contacts Count: " + contactsCount);
}
public static void main(String[] wtsp){
	saveUserAccount("+919535267077",true,"swathipatgar1504@gmail.com", 350);
}
}
