package Day6;

public class CallByReference {
public static void main(String[] args) {
	//when an array passed to a method and
	//if the method changes the value the original array also changes
	int arr[]= {1,2,3,4,5};
	System.out.println("The values of the given array before calling function: ");
	for(int i =0; i<arr.length;i++) 
	{
		System.out.print(arr[i]);
		if(i != arr.length-1)
		{
		  System.out.print(", ");
		}
	}
	
	System.out.println();
	displayValues(arr);
	
}
 static void displayValues(int []arr1) {
	 arr1[1]=3;
	 System.out.println("The values of the given array after calling function: ");
		for(int i =0; i<arr1.length;i++) 
		{
			System.out.print(arr1[i]);
			if(i != arr1.length-1)
			{
			  System.out.print(", ");
			}
		}

	 }

}
