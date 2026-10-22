
public class First{
int b;// non static variable
static int c;
public static void main(String args[])
{
int a=5;//local variable
System.out.println("Hello World");
System.out.println(a);
//System.out.println(b);
System.out.println(c);
First.c=100;
System.out.println(c);
String name="Apoorva";
name= name.toUpperCase();//print all the letters in Upper Case
System.out.println("The name has changed into upper case as: " + name);//observe the output
char ch= name.charAt(0);
System.out.println("Character at position 0 is "+ ch);
char e= name.charAt(5);//character at position 5.
System.out.println(e);
//static int d;//inside a method a variable cannot be static
int f = name.length();//we are calling the length method using the name object.
System.out.println(f);
//a.length();//length method can be called using string object only.
//find the position of the first occurance of "o".
int i= name.indexOf('O');//'O' is case sensitive.
System.out.println("The index at letter O will be: "+ i);

}

}