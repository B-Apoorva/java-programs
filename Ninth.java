
public class Ninth {
public static void main(String[] args) {
	String name="Apoorva";
	int Index1 = name.indexOf('o');//It will print the first occurance.
	System.out.println(Index1);
	int Index2 = name.lastIndexOf('o');//this method will search for the past value in the string and will return the last one
	System.out.println(Index2);
	String x=name.replace('o', 'u');
	System.out.println(x);
	String s1="rose lotus";//find the length of the string without the spaces
	String n=s1.replace(" ", "");
	int len=n.length();
	System.out.println(len);

}
}
