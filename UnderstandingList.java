/* Advantage of arrays: 
  It is used to store multiple values.
  all values are of the same datatype.
  --  Disadvantages of an array :
  array size must be given
   */

/*
 //ArrayList is an improvement on array
//Problem with array is it's of fixed size, insertion and deletion
//ArrayList can store duplicate value
//ArrayList gives random Access
//ArrayList maintains order in which values are added
//ArrayList size can be increased  and decreased
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UnderstandingList {

	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
		int []a=new int[5]; // here array size is given priorly during declaration
		//a[0]=1;
		System.out.println("Enter 5 values for an array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("The array values are given as follows: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		 System.out.println("Can we update the values in an array ? : answer is -- yes");
		a[4]=3;
		
		
		//we can print entire ArrayList directly -- using print statement
		//we cannot print array directly - need to use For Loop
		
		System.out.println("The new updated array is given as follows: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("The length of the given array is: " + a.length); 
		// a.length is only present in arrays. 
		
		*/
		
		// now we use an ArrayList
		// we need to import : java.util.ArrayList;
		//declaration: List <Generics> listName = new ArrayList<Generics>();
		// or : ArrayList<Generics>listName = new ArrayList<Generics>();
		
		
		//task: //create an object of class ArrayList
		List<Integer> arlst1 =new ArrayList<Integer>();
		arlst1.add(1);//adding values into the ArrayList
		arlst1.add(2);
		arlst1.add(3);
		System.out.println("The ArrayList of integers type is as follows: " + arlst1);
		//We can directly print the ArrayList instead of for loop.
		
		int sum=0;
		int product=1;
		//method 1 : calculating sum using normal for loop traversal
		for(int i =0; i<arlst1.size(); i++) //We don't have length() for ArrayList
			// List have size().
		{
			sum=sum + arlst1.get(i); // .get(i) is used to get the number of that index of the array list
					
		}
		
		//method 2: using --- for each loop:
		
		for(int num : arlst1) {  // here num is the iterator and arlst1 will be the list name
			product= product * num; // use the iterator directly
		}
		
		System.out.println("The sum of the values of this ArrayList is: " + sum);
		System.out.println("The product of the values of this ArrayList is: " + sum);
		
		
		
// ArrayList operations:
	 // 1. to add an element into the ArrayList:
		arlst1.add(4); 
		// output: [1, 2, 3, 4]
		arlst1.add(4,5); //2nd way Syntax: arrayListName.add(int index, integer element);
	 // to check:
		System.out.println(arlst1);	
		//output: [1, 2, 3, 4, 5]
		arlst1.addFirst(0); // adds the given element to the first(0) index
		arlst1.addLast(6);  // adds the given element to the last(5th) index (total 6 values)
	 // to check:
		System.out.println(arlst1);	
		// output: [0, 1, 2, 3, 4, 5, 6]
		
	// 2. to update the ArrayList : set / update the value of a particular index
		arlst1.set(3,2); //Syntax: ArrayListName.set(int index, integer element)
		System.out.println(arlst1);
		//output: [0, 1, 2, 2, 4, 5, 6] -- we can see duplicate values are allowed in ArrayList
		
	// 3. to retrieve(get) the value at a particular index
		System.out.println(arlst1.get(3));
		//output: 2
		
	// 4. to get the first element of the ArrayList directly:
		System.out.println(arlst1.getFirst());
		//output: 0
		// or store it in a variable and print it-- int firstElement =arlst1.getFirst();
		
	// 5. to get the last element of the ArrayList directly:
		System.out.println(arlst1.getLast());
		// output: 6
		// or store it in a variable and print it-- int lastElement =arlst1.getLast();	
		int lastElement =arlst1.getLast();
		System.out.println("The last element of the list is: " + lastElement);
		// output: 6
		
	// 6. to retrieve the index of a particular element
		int elementIndex= arlst1.indexOf(6);
		System.out.println("Index of value 6 is: " + elementIndex);
		// output: 6
		
	// 7. to retrieve the last appearance (index) of a given value in a list
		int lastAppear = arlst1.lastIndexOf(2);
		System.out.println("The last Appearance of the digit 2 in the list is at index: " + lastAppear);
		
		//work with :addAll, clear, contains(), containsAll(), equals(), forEach(), isEmpty(), iterator(), listIterator(), toString(), toArrat()
		// remove(), removeFirst(), removeLast(), removeAll(). retainAll(), replaceAll(), reversed(), sort(),subList()
		
	// 8. to check if an element exist in a list
		Boolean check = arlst1.contains(1);
		System.out.println(check);
		if(check == true) {
			System.out.println("The element is present at index : "+ arlst1.indexOf(1));
		}
	
	}

}
