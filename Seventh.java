public class Seventh{
	public static void main(String[] args) {
		String name="Apoorva;Banka";
		String subString1 = name.substring(2);
		System.out.println(subString1);
		String subString2 = name.substring(0,6);
		System.out.println(subString2);
		String string1[] =  name.split(";");
		for (int i=0;i<string1.length;i++) {//when length is used with an array don't use paranthesis
			System.out.println(string1[i]);
			int myName=name.length();
			System.out.println(myName);
			}		
	}
}