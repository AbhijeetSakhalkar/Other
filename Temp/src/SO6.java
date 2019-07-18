import java.util.Scanner;


public class SO6 {

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
        int n = s.nextInt();                 // Reading input from STDIN
        s.nextLine();
        String str = null;
        StringBuffer strBuf = null;
        while(n>0){
        	strBuf = new StringBuffer();
            str = s.nextLine();
            strBuf.append(str.charAt(0));
            for(int i=1;i<str.length();i++){
            	if(str.charAt(i)!=str.charAt(i-1)){
            		strBuf.append(str.charAt(i));
            	}
            }
            System.out.println(strBuf.toString());
            n--;
        }

      

        // Write your code here

    }

}
