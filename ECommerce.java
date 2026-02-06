class ECommerce {
public static void main(String[] website) {

String siteName = "Flipkart";
String founderName = "Amit";
String headquarters = "Hyderabad";
String categories[] = {"Electronics", "Fashion", "Groceries"};
String deliveryPartners[] = {"Ravi", "Suresh", "Karthik"};

System.out.println("The site name is " + siteName);
System.out.println("The founder name is " + founderName);
System.out.println("The headquarters is " + headquarters);

for (String category : categories)System.out.println(category);
for (String partner : deliveryPartners)System.out.println(partner);
    }
}
