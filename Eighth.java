public class Eighth{
	public static void main(String[] args) {
		String name1="Apoorva";
		String name2="apoorva";
		String name3="Apoorva";
		boolean result1 = name1.equals(name2);
		System.out.println("Are name1 and name2 equal? : "+result1);
		boolean result2 = name1.equals(name3);
		System.out.println("Are name1 and name3 equal? : "+result2);
		boolean b=name1.equals(name2);//equal method is case sensitive
		if(b==true) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equal");
		}
		boolean t=name1.equalsIgnoreCase(name2);//equalsIgnoreCase method ignores the case sensitive
		if(t==true) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equal");
		}
	}
}