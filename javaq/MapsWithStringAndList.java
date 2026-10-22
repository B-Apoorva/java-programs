package javaq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
/*
 create a program which stores data into this Map<String,List<String>>
 
entries in the map are 
key                       value
lowercase           [c,a,p,g,e,m,i,n,i]
upper case          [A,B,C]
numbers             [1,2,3]
 
accept a value from the user ; containing a combination of lower case upper case and numbes ;
 
store it in the map as per above description 
 
 */
public class MapsWithStringAndList {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	HashMap<String,List<String>> map=new HashMap<String,List<String>>();
	List <String> upperCase =new ArrayList<String>();
	List <String> lowerCase =new ArrayList<String>();
    List <String> numbers= new ArrayList<String>();
	
    System.out.println("Enter the Strong Password (combination of Uppercase Letters, Lowercase Letters and Numbers : ");
    String password=sc.next();
    for(int i=0;i<password.length();i++) {
    	char ch=password.charAt(i);
    	if(Character.isUpperCase(ch)) {
    		upperCase.add(ch+"");
    	}
    	else if(Character.isLowerCase(ch)) {
    		lowerCase.add(ch+"");
    	}
    	else if(Character.isDigit(ch)) {
    		numbers.add(ch+"");
    	}
    }
    map.put("UpperCase", upperCase);
    map.put("LowerCase", lowerCase);
    map.put("Numbers", numbers);
    
    System.out.println(map);
	
}
}
