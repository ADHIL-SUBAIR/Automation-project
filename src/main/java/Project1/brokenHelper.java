package Project1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class brokenHelper {
	public static int linkChecker(String urlstr) throws IOException {
		int count=0;
		try {
			
			URL url=new URL(urlstr);
			HttpURLConnection httpurl=(HttpURLConnection) url.openConnection();
			httpurl.connect();
			
			int statusCode=httpurl.getResponseCode();
			
			if(statusCode>=400) {
				System.out.println("The given is a broken link : "+urlstr);
				count++;
			}
			else {
				System.out.println("Given link is a valid link : "+urlstr);
				
			}
		}
		finally {}
		
		return count;
		
	}

}
