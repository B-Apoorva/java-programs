public class Eleventh {
	public static void main(String[] args) {
		String name = "Apoorva B";
		for(int i = 0; i<name.length();i++)
		{
			char ch = name.charAt(i);
			boolean b = Character.isUpperCase(ch);
			if(b==true)
			{
				char j = Character.toLowerCase(ch);
				System.out.print(j);
			}
			else
			{
				char h = Character.toUpperCase(ch);
				System.out.print(h);
			}
			
			
		}
	}
 
}