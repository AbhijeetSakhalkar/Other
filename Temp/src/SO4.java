import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SO4 {
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
        int tc = s.nextInt();
        s.nextLine();
        String [] arr = new String [6];
        List<String> arrList = null;
        while(tc>0){
            String time = s.nextLine();
            arr = time.replaceAll(":", "").split("");
            arrList = new ArrayList<String>(Arrays.asList(arr));
            for(int i = 0 ; i<6 ; i++){
            	boolean x = true;
            	for(int j=i;x;j++){
            		if(arrList.contains(String.valueOf(j))&&j!=0){
            			
            		}
            		else{
            			arr[i] = String.valueOf(j);
            			x=false;
            		}
            	}
            }
            System.out.print(arr[0]);
            System.out.print(arr[1]);
            System.out.print(":");
            System.out.print(arr[2]);
            System.out.print(arr[3]);
            System.out.print(":");
            System.out.print(arr[4]);
            System.out.print(arr[5]);
            System.out.println();
            tc --;
        }
        

    }
}
