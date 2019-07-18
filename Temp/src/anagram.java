import java.lang.*;
import java.io.*;
import java.util.*;


public class anagram
{


    public static void main(String args[])
    {

        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter first word");
        String a = kbReader.next();
        System.out.println("Enter second word");
        String b = kbReader.next(); ///User inputs 2 strings, a and b
        a = a.toLowerCase();
        b = b.toLowerCase();

        int numA = a.length();
        int numB = b.length();

        if (numA != numB)
           System.out.println("NOT AN ANAGRAM"); 



        for(int i = 0;i < numA; i++) ///continues until all letters are used
        {
            String letter = b.substring(i,i++);
            int checker = a.indexOf(letter);///checks word a for every letter of b

            System.out.println(checker); ///always get 0 for this value, why never -1?



       }
   }


}