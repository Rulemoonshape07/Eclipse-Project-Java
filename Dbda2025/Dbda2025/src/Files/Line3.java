package Files;
import java.io.*;

public class Line3 {
	public static void main(String[] args) throws IOException{
		

		BufferedReader br = new BufferedReader(new FileReader("C:/Users/vidhi/Desktop/CDAC/JavaFile/data.txt"));
	
		String line = br.readLine();
		int lc = 0;
		while(line != null && lc<3) {
			System.out.println(line);
			line = br.readLine();
			lc++;
		}
		br.close();
		
		
		
		
	}

}
			//3.  Write a Java program to read first 3 lines from a file.