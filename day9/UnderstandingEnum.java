package day9;
//enum is used to create a new datatype
//a variable of this data type will contain one of the declared values
//below the new data type is seasons
//Where ever data types is used, there enum can also be used.
	enum Seasons{
		Summer, Spring, Rainy, Autumn, Winter
	}
	
	public class UnderstandingEnum{
		public static void main(String[] args) {
			Seasons season1 = Seasons.Winter;
			Crop crop1=new Crop("Paddy",Seasons.Winter);
			
		}
	}
	
	//overriding is present only when inheritance is present.
	//If there is a method in parent class, child class can optionally change the method
	// the logic by overriding the parent class method
	 class Crop{//extends Object class
		//class crop is a child of java.lang.Object
		 //toString() is a method of Object class
		 //class crop has overridden the toString()
		 //In overriding the method return type cannot changr, it has to be same
		String cropName;
		Seasons cropSeason;
		public Crop(String cropName, Seasons cropSeason1) {
			// TODO Auto-generated constructor stub
			
		}
		
	}


