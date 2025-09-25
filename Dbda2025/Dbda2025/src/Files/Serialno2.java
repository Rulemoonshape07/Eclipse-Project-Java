package Files;

import java.io.*;

public class Serialno2 {
		public static void main(String[] args) throws IOException{
			
			//create a new folder and create data file and dont add.txt and a result file is already created 
			//when u give result pasth same as data file just chnge the result 
			
			
			FileReader fr = new FileReader("C:/Users/vidhi/Desktop/CDAC/JavaFile/data.txt");
			FileWriter fw = new FileWriter("C:/Users/vidhi/Desktop/CDAC/JavaFile/serial.txt");
			
			int x;
			int lc = 1;
			
			fw.write(lc+ ":");
		
			while((x = fr.read()) !=-1) { //checking that the file is empty or not
				fw.write(x);
				
				if(x=='\n') {
					lc++;
					fw.write(lc+ ":");
				}
				}
			fr.close();
			fw.close();		
			

		}

	}
//2. Write a program to read the same program file and write it to other file with 
//the lines number added before each line, starting from 1.

	



