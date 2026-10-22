public class Tenth{
	public static void main(String[] args) {
		String s1= " Hello, how are you? ";
		String[] k=s1.split(" ");
		System.out.println("The string "+s1+ " has"+ k.length +" words");//with a array we cannot use length as a method
		String s2="";
		boolean d=s2.isEmpty();//space will be a matter
		System.out.println(d);
		String s3=" ";
		boolean v=s3.isBlank();//Space does not matter
		System.out.println(v);
		String l=s1.trim();
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(l);
		System.out.println(l.length());
		
	}
}