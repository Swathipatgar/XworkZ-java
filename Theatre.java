class Theatre {
public static void main(String[] cinema) {

String theatreName = "Bharath Theatre";
String ownerName = "mahesh";
String address = "Bengaluru";
String screens[] = {"Screen 1", "Screen 2", "Screen 3","Mega Screen","HD Screen"};
String staff[] = {"Manager", "Ticket Clerk", "Projectionist","Cashier","Handler"};

System.out.println("The theatre name is " + theatreName);
System.out.println("The owner name is " + ownerName);
System.out.println("The address is " + address);
for (String screen : screens)System.out.println(screen);
for (String member : staff)System.out.println(member);
    }
}
