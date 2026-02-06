class PoliceStation {
public static void main(String[] args) {

String stationName = "Central Police Station";
String inspectorName = "Shankar";
String location = "Hubballi";
String divisions[] = {"Traffic", "Crime", "Cyber"};
String officers[] = {"Arun", "Abhishek", "Arjun"};

System.out.println("The station name is " + stationName);
System.out.println("The inspector name is " + inspectorName);
System.out.println("The location is " + location);

for (String division : divisions)System.out.println(division);
for (String officer : officers)System.out.println(officer);
    }
}
