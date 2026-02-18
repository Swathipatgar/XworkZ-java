class PhoneContactExecutor
{
    public static void main(String[] contant)
    {
        String contactName = "Swathi";

        long contactNumber = PhoneContact.getContactNumber(contactName);

        System.out.println("The contact number of " + contactName + " is: " + contactNumber);
    }
}
