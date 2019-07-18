import java.util.Scanner;


public class SO7 {

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
        int n = s.nextInt();
        int count = 0; 
        int a, b, c;
        while(n>0){
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if(b*b >= 4*a*c){
            	count++;
            }
            n--;
        }
        System.out.println(count);
    }

}
