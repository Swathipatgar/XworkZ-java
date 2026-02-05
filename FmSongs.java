class FmSongs{
public static void main(String[] songs){
String fmsongsNames[]={"cahrlie","manave"};
String cahrlie=fmsongsNames[0];
String manave=fmsongsNames[1];
System.out.println("The list of the songs are"+fmsongsNames.length);
System.out.println(cahrlie+ " "+manave+" ");
for (String fmsongsName: fmsongsNames)
{
	System.out.println(fmsongsName);
}

}
}