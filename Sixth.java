public class Sixth{
		public static void main(String[] args) {
			int[] i =new int[5];
			i[0]=2;
			i[1]=3;
			i[2]=4;
			i[3]=5;
			i[4]=6;
			System.out.println(i);
			String h= String.valueOf(i);//value of will work with character array
			System.out.println(h);
			for(int j=0;j<5;j++) {
				System.out.println(i[j]);
			}
//		call the method get bytes of string class
			String a="neha";
			byte b[]=a.getBytes();//the return type of a method can be array
			System.out.println(b);
			for(int j=0;j<4;j++) {
				System.out.println(b[j]+" "+(char)b[j]);
			}
			
		    
		}
	}
	 
