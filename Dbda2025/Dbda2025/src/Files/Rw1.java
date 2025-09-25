package Files;
import java.io.*;

public class Rw1{

	public static void main(String[] args) throws IOException{
		//create a new folder and create data file and dont add.txt and a result file is already created 
		//when u give result pasth same as data file just chnge the result 
		
		
		FileReader fr = new FileReader("C:/Users/vidhi/Desktop/CDAC/JavaFile/data.txt");
		FileWriter fw = new FileWriter("C:/Users/vidhi/Desktop/CDAC/JavaFile/result.txt");
		
		int x;
		int lc = 0;
		int wc = 0;
		int cc = 0;
		while((x = fr.read()) !=-1) {
			System.out.print((char)x);
			cc++;
			
			if(x==' ') {
				wc++;
			}
			if(x=='\n') {
				lc++;
			}
			
		}
		fw.write("\nNo. of Character : "+cc);
		fw.write("\nNo. of words : "+(wc+lc));
		fw.write("\nNo. of Lines : "+lc);
		fr.close();
		fw.close();		
		

	}

}

//1. Write a Program to read the same program file and find the no. of lines, words
//and characters. Write the result in in to a text file (result.txt)

