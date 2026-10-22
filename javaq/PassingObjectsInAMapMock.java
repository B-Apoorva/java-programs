package javaq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 
import java.util.*;

class DataHolder {
    List<Integer> intList;
    List<String> strList;

    public DataHolder(List<Integer> intList, List<String> strList) {
        this.intList = intList;
        this.strList = strList;
    }
}

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("A", "B", "C");

        Map<String, DataHolder> map = new HashMap<>();
        map.put("key1", new DataHolder(numbers, words));

        // Accessing values
        System.out.println(map.get("key1").intList);
        System.out.println(map.get("key1").strList);
    }
}



UPLOAD ReportFile V1 25
UPLOAD ReportFile V2 30
UPLOAD ReportFile V3 10
UPLOAD Notes.txt V1 10
FETCH ReportFile
FETCH SummaryData
 */

class DataHolder
{
	List<String> version;
	List<Integer> intList;
	
	public DataHolder(ArrayList<String> version, ArrayList<Integer> intList)
	{
		this.version=version;
		this.intList=intList;
	}
}
public class PassingObjectsInAMapMock {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String>version =new ArrayList<String>();
	boolean wish;
	while(true)
	{
		System.out.println("Add the version of the Report file : ");
		version.add(sc.next());
	
		System.out.println("do you wish to add more? ");
		wish = sc.nextBoolean();
	if(wish==false) 
		break;
	}
	
	
	ArrayList<Integer> intList=new ArrayList<Integer>();
	System.out.println("Add the series of the Report file : ");
	intList.add(sc.nextInt());
	
	DataHolder obj1= new DataHolder(version,intList);
	DataHolder obj2= new DataHolder(version,intList);
	HashMap<String,List<DataHolder>> hMap=new HashMap<String,List<DataHolder>>();
	hMap.put("ReportFile",obj1);
	hMap.put("Notes",obj2);
	if(hMap.containsKey("ReportFile")) {
		System.out.println(hMap.values());
	}
	else if(hMap.containsKey("Notes")) {
		System.out.println(hMap.values());
	}
	else {
		System.out.println("File Not Found");
	}
}
}
