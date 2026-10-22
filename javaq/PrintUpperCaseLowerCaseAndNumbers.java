package javaq;
//declare a string variable which contains a value which is a  mix of letters and numbers
//print the number of uppercase letters,lowercase letters & numbers
public class PrintUpperCaseLowerCaseAndNumbers {
public static void main(String[] args) {
		
String value ="Apoorva.b2k@gmail.com";
int ucCount=0;
int lcCount=0;
int numCount=0;
int scCount=0;
for(int i=0;i<value.length();i++) {
	char ch = value.charAt(i);
	String str= ch +"";
    boolean b=str.matches("[0-9]");
    if(b==true){
    	numCount++;	
	}
    boolean b1=str.matches("[A-Z]");
    if(b1==true) {
    	ucCount++;
    }
    boolean b2=str.matches("[a-z]");
    if(b2==true) {
    	lcCount++;
    }
    boolean b3=str.matches("[~!@#$%^&*()._-]");
    if(b3==true) {
    	scCount++;
    }  
}

System.out.println("The number of Upper Case Characters in the given string are: "+ucCount);
System.out.println("The number of lower Case Characters in the given string are: "+lcCount);
System.out.println("The total numbers present in the given string are: "+numCount);
System.out.println("The number of special Characters in the given string are: "+scCount);
}
}
