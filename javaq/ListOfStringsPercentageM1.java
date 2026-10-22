package javaq;
//import java.util.ArrayList;
//import java.math.*;
import java.util.*;

public class ListOfStringsPercentageM1 {
public static void main(String[] args) {
	ArrayList<String> arlst= new ArrayList<String>();
	arlst.add("Apple");
	arlst.add("Ball");
	arlst.add("Cat");
    arlst.add("Dog");
    arlst.add("Table");
    ArrayList<String> arlst1= new ArrayList<String>();	
	int K=3;
	arlst1.add("Apple");
	arlst1.add("Ball");
	arlst1.add("Cap");
	
	int arlstSize=0;
	boolean b=arlst.retainAll(arlst1);
	if(b==true) {
		 arlstSize= arlst.size();	 
	}
	
	System.out.println(arlstSize);
	double percentage= (arlstSize*100.0)/K;
			//(arlstSize/K)*100;
	System.out.println(percentage);
	double result= Math.ceil(percentage);
	int result1=(int)result;
	//int result1=Integer.parseInt(result);
	System.out.println(result);
	System.out.println(result1);
}
}
