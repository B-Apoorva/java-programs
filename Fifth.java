
public class Fifth {
	public static void main(String[] args) {
		//String name ="Apoorva";
		char[] ch= new char[5];//this is syntax to declare an array
		ch[0]= '1';
		ch[1]= 'a';
		ch[2]= '2';
		ch[3]='b';
		ch[4]= 97;
//		ch[5]='c';
		
		//System.out.println(ch);// printing an array prints memory address
		
		String v= String.valueOf(ch);
		System.out.println(v);
		
		for(int i= 0; i<5; i++) {
			System.out.println(ch[i]);
		}
		
		
	}
 
}
 