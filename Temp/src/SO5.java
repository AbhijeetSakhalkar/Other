import java.util.Scanner;


public class SO5 {

	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();                 // Reading input from STDIN
        int[] arr = new int[4];
        int c = 0;
        int n = 0;
        while(T>0){
            arr[0] = s.nextInt();
            arr[1] = s.nextInt();
            c = s.nextInt();
            n = s.nextInt();
            long res = 0;
            res = (long) (Math.pow(10,n-1) * arr[0]);
            res = (long) (res + (Math.pow(10,n-2)) * arr[1]);
            for(int i = 2; i<n; i++){
                res = (long) (res + ((Math.pow(10,(n-(i+1)))) * ((arr[i-1]*c)+(arr[i-2]))%10));
            }
            
            if(res%41 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            T--;
        }

    }

}
