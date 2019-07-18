import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SetSubsets {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String firstLine [] = null;
		
		try {
			firstLine = br.readLine().split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

		firstLine[0].replace("{",new String(""));
		firstLine[firstLine.length-1].replace("}", new String(""));
		
		
		
		long number = Math.round(Math.pow(2, firstLine.length))-1;
		String bin = new String (); 
		for(long j=0;j<number;j++){
			bin = Long.toBinaryString(j);
			
		}
		
		
	}

}
