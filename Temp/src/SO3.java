import java.util.Scanner;


public class SO3 {

	public static void main(String args[] ) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();                 // Reading input from STDIN
        boolean square = false;
        // Write your code here
        for(long i=0; i<N/2;i++){
            if((i*i)<N){
                
            }else if((i*i)>N){
                continue;
            }
            else{
                square = true;
            }
        }
        if(square){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
