
public class StringComparision {
	public static void main(String[] args) {
		
		// TO DO Auto-generated method stub
		String s1="Apoorva";
		String s2="Apoorva";
		if (s1==s2){ // the == operator compares memory address of the strings
			System.out.println("both strings s1,s2 share same memory");
		}
		else {
			System.out.println("both strings s1,s2 do not share same memory");//when two
			//objects share the same value then only one object is created in the memory and
			// s1 and s2 contain the memory address of that object.
			
		}
		String s3= new String("Apoorva");//using the new keyword forces the creation of
	//new object even though the value is same as existing object
		if (s1==s3){
			System.out.println("both strings s1,s3 share same memory");
		}
		else {
			System.out.println("both strings s1,s3 do not share same memory");
			
	}

	}
}
