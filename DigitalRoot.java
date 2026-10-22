
public class DigitalRoot {
	public static void main(String[] args) {

		int n = 38;
		int m=0, sum, rem=0;
		for(int i=n;i>0;i--)
		{
	   rem = n%10;
		n=n/10;
		rem = rem+n;
		 m = rem%10;
		rem=rem/10;
		}
		 sum = m+rem;
		System.out.println(sum);
	}
}
