package Day6;
import java.util.ArrayList;
import java.util.Vector;

public class PassingArrayList {
public static void main(String[] args) {
	
	ArrayList <Integer>arrlst2 =new ArrayList<Integer>();
	arrlst2.add(0);
	arrlst2.add(1);
	
	ArrayList <Float>arrlst =new ArrayList<Float>();
	arrlst.add(0.1f);
	arrlst.add(1.4f);
	
	ArrayList <String> arrlst1 = new ArrayList<String>();
	arrlst1.add("Apoorva");
	arrlst1.add("Capgemini");
	PassingArrayList.displayList(arrlst1);
	PassingArrayList.displayList(arrlst2);
	PassingArrayList.displayList(arrlst);
	
}
static void displayList(ArrayList<?>o) { //When you are not sure about the Generic, then put a "?", To avoid warnings. .
//We need use Generics to avoid warnings.	
	System.out.println(o);	
}
}
