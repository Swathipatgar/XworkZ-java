class Hospital {
public static void main(String[] hsptl) {
String hospitalName = "Arundati Hospital";
String founderName = "Dr.Anandh";
String address = "Sirsi";	
String departments[] = {"Cardiology", "Neurology", "Orthopedics"};
String doctors[] = {"Dr. Ravi", "Dr. Raju", "Dr. Ramya"};

System.out.println("The hospital name is " + hospitalName);
System.out.println("The founder name is " + founderName);
System.out.println("The address is " + address);

for (String department : departments) System.out.println(department);
for (String doctor : doctors) System.out.println(doctor);
    }
}
