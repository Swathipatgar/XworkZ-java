class Company{
public static void main (String [] comp){
String companyName="Maiora";
String ownerName="Swathi";
String adress="Sirsi";
String branches[]={"Rajajinagara","Shivajinagara","Malleshwaram"};
String managers[]={"Chaitu","Ramya","Shrusti"};
System.out.println("The Company name is" + companyName);
System.out.println("The owner name is"+ownerName);
System.out.println("The adress is:"+ adress);
for(String branch:branches)System.out.println(branch);
for(String manager:managers)System.out.println(manager);
}
}
