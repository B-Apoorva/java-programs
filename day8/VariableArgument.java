package day8;
//When should we use variable argument list?
//It is an alternative to method overloading
//This method takes values of same data type
public class VariableArgument {
 public static void main(String[] args) {
	 int a =10;
	 int b=20;
	 int c =30;
	 int d =35;
	int sum = add(a,b);
	int sum1 = add(a,b,c);
	int sum2 = add(a,b,c,d);

	System.out.println(sum);
	System.out.println(sum1);
	System.out.println(sum2);

}

/*public static int add(int x, int y) {
	return x+y;
}
public static int add(int x, int y,int z) {
	return x+y+z;
}
*/
 
 public static int add(int...x) {
	 int sum=0;
	 for(int i=0;i<x.length;i++) {
		 sum=sum+x[i];
	 }
	 return sum;
 }
}