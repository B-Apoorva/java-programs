package javaq;

public class ArrayOfStringSumOfReceprocalM1 {
public static void main(String[] args) {
	String[]arr= {"12345"};
	for(int j=0;j<arr.length;j++)
	{
//		int i=Integer.parseInt(arr[j]);
//		System.out.println(i);
//		
//		
//	}}}
	
	String first="";
	for(int i=0;i<arr.length;i++) {
		first=arr[i];
	}
	//int num=Integer.parseInt(first);
	//System.out.println(num);
	System.out.println(first);
	char ch=' ';
	double sum=0;
		for(int i=0;i<first.length();i++) {
			ch=first.charAt(i);
		
			//int num=Integer.valueOf(ch);
			
			int num=Character.getNumericValue(ch);
			if(num!=0) {
			sum=sum+1.0/num;// Use 1.0 / num to ensure floating-point division.
			}
			else if(num==0){
				sum=sum+num;
			}
		}
	
	System.out.println(sum);
	
}
}
}
