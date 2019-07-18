import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class twikiripper {


	public static URL url;


	public static void main(String[] args) {
		BufferedReader br = null;

		try{
			url = new URL("http://www.google.com");
		}catch(MalformedURLException ex){}
		try {
			url.openConnection();
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;

			StringBuilder sb = new StringBuilder();

			while ((line = br.readLine()) != null) {

				sb.append(line);
				sb.append(System.lineSeparator());
			}

			System.out.println(sb);



		}catch(Exception e){
			System.out.println("Exception: "+e.toString());
		}
	}
}