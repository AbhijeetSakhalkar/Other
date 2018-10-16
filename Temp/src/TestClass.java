/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] firstLine;
        String track[];
        long trackInt [];
        long power;
        int testCases = Integer.parseInt(br.readLine());

      
        while(testCases > 0) {
        	boolean lost = false;
        	firstLine = br.readLine().split(" ");
        	//hurdles = Integer.parseInt(firstLine [0]);
        	power = Long.parseLong(firstLine [1]);
        	
        	track = br.readLine().split(" ");
        	trackInt = new long [track.length];
        	for(int j=0; j<track.length;j++) {
        		trackInt[j] = Integer.parseInt(track[j]);
        	}
        	
        	for(int i=0; i<track.length;i++) {
        		if(power<trackInt[i]) {
        			lost = true;
        			break;
        		}
        		power = power - (int) trackInt[i];
        		if(i!=0){
        			for(int k=i+1;k<track.length;k++){
        				if(trackInt[k]>0)
        					trackInt[k] = trackInt[k] - 1; 
        			}
        		}
        		else{
        			for(int k=i+1;k<track.length;k++){
        				if(trackInt[k]>0&&trackInt[k]%2==0)
        					trackInt[k] = trackInt[k] - 1; 
        			}
        		}
        		
        	}
        	if(lost == true) {
        		System.out.println("No");
        	}
        	else {
        		System.out.println("Yes "+power);
        	}
        	
        	
        	testCases --;
        }
        
    }
}
