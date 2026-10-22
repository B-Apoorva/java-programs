package Day5;
//one employee object can store information only about one employee
// if we want to store info about many employees then use array, list, set or map
public class EmployeeArray {
	public static void main(String[] args) {
    //int a[]=new int[5];a[0]=1;
	Employee []e=new Employee[3];
	Employee emp1=new Employee(20001,"Apoorva",'f',5.5f,true);
	e[0]=emp1;
	int id = emp1.getEmployeeId();
	//System.out.println("The employee id is: "+ id);
	String name = emp1.getName();
	//System.out.println("The employee name is: "+ name);
	char gender = emp1.getGender();
	//System.out.println("The employee gender is: "+ gender);
	float ht = emp1.getHeight();
	//System.out.println("The employee ht is: "+ ht);
	boolean exp = emp1.isExperienced();
	//System.out.println("Is the employee experienced ? : "+ exp);
	
	//System.out.println();
	
	Employee emp2=new Employee(20002,"Neha", 'f', 5.3f, true);
	e[1]=emp2;
	int id1 = emp2.getEmployeeId();
	//System.out.println("The employee id is: "+ id1);
	String name1 = emp2.getName();
	//System.out.println("The employee name is: "+ name1);
	char gender1 = emp2.getGender();
	//System.out.println("The employee gender is: "+ gender1);
	float ht1 = emp2.getHeight();
	//System.out.println("The employee ht is: "+ ht1);
	boolean exp1 = emp2.isExperienced();
	//System.out.println("Is the employee experienced ? : "+ exp1);
	
    //System.out.println();
	
	Employee emp3=new Employee(20003,"Poojitha", 'f', 5.4f, false);
	e[2]=emp3;
	int id2 = emp3.getEmployeeId();
	//System.out.println("The employee id is: "+ id2);
	String name2 = emp3.getName();
	//System.out.println("The employee name is: "+ name2);
	char gender2 = emp3.getGender();
	//System.out.println("The employee gender is: "+ gender2);
	float ht2 = emp3.getHeight();
	//System.out.println("The employee ht is: "+ ht2);
	boolean exp2 = emp3.isExperienced();
	//System.out.println("Is the employee experienced ? : "+ exp2);
	
	//System.out.println();
	
	
	for(int i =0; i<e.length;i++) {
		//System.out.println(e[i]);
		int id3 = e[i].getEmployeeId();
		System.out.println("The employe id is: "+ id3);
		String name3 = e[i].getName();
		System.out.println("The employee name is: "+ name3);
		char gender3 = e[i].getGender();
		System.out.println("The employe gender is: "+ gender3);
		float ht3 = e[i].getHeight();
		System.out.println("The employe ht is: "+ ht3);
		boolean exp3 = e[i].isExperienced();
		System.out.println("Is the employee experienced ? : "+ exp3);
		System.out.println();
		
	}
	}
}
