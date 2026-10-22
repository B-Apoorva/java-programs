package javaq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Day5.Employee;

/*
 
ADD Banglore Poojitha 24
ADD Banglore Misba 30
ADD Banglore Rishika 10
ADD Chennai Garima 13
FETCH Banglore
FETCH Mumbai
map<String,List<Employee>>
 
 
Create a class employee to store employee name,id
 
 */
public class MapWithStringAndListOfCities {
public static void main(String[] args) {
	HashMap<String,List<NewEmployee>> EmpMap= new HashMap<String,List<NewEmployee>>();
	List <String> city = new ArrayList<String>();
	List <String> name= new ArrayList<String>();
	List <String> empId = new ArrayList<String>();
	NewEmployee emp1= new NewEmployee("Bangalore","Apoorva","20002");
	NewEmployee emp2= new NewEmployee("Bangalore","Jyoshita","20003");
	NewEmployee emp3= new NewEmployee("Bangalore","Meghana","20004");
	
}
}
