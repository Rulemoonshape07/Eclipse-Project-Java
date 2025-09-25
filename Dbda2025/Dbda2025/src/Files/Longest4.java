package Files;
import java.io.*;

public class Longest4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/vidhi/Desktop/CDAC/JavaFile/data.txt"));
        
        String line;
        String longest = "";

        // read every line in file
        while ((line = br.readLine()) != null) { //readline should be used inside while loop because we need that again and again
            String[] words = line.split(" ");  // split line into words
            for (String w : words) {
                if (w.length() > longest.length()) {
                    longest = w;   // store bigger word
                }
            }
        }

        br.close();
        System.out.println("Longest word: " + longest);
    }
}


//4.  Write a Java program to find the longest word in a text file
