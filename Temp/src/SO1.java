import java.util.Scanner;


public class SO1 {

/*	public static void main(String[] args)
	{

	  Scanner keyboard = new Scanner(System.in);
	  System.out.println("Please enter the words: "); 
	  String word = keyboard.next(); 

	  while (keyboard.hasNext())
	  {
	    printStem(word);
	    word = keyboard.next();
	  }
	}*/

	
	public static void main(String[] args)
	{
	  Scanner keyboard = new Scanner(System.in);
	  System.out.println("Please enter the words: "); 

	  while (keyboard.hasNext())
	  {
	    String word = keyboard.next();
	    printStem(word);
	  }
	}
	
	private static void printStem(String word) {
		
		System.out.println(word);
		
	}
	
	
}
