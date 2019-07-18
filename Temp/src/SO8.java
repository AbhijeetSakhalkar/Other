//https://www.hackerearth.com/codearena/ring/a464ce0/
import java.util.Scanner;


public class SO8 {

	public static void main(String[] args) {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();                 // Reading input from STDIN
        int n, b, g;
        while(tc>0){
        	n = s.nextInt();
        	b = s.nextInt();
        	g = s.nextInt();
        	if(b-g>=2 || g-b>=2){
        		System.out.println("Little Jhool wins!");
        	}
        	else{
        		System.out.println("The teacher wins!");
        	}
        	tc--;
        }

  

        // Write your code here

    }

}
