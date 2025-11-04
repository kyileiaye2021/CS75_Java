// Kyi Lei Aye
package Lab11;
import java.io.File;
import java.util.Scanner;
public class FileHandlingKLA {

    public static void main(String[] args) {

        int total_chars = 0;
        int max_word_len = 0;
        String longest_word = "";
        int total_words = 0;
        try {
            File myFile = new File("Lab11/sample.txt");
            Scanner Reader = new Scanner(myFile);
            
            while(Reader.hasNext()){
                String word = Reader.next();
                total_words += 1;
                total_chars += word.length();

                if(word.length() > max_word_len){
                    max_word_len = word.length();
                    longest_word = word;
                }
            }
            System.out.println("Total words: " + total_words);
            System.out.println("Total chars (in words): " + total_chars);
            System.out.println("Longest word: " + longest_word);
            Reader.close();
        } catch (Exception e) {
            System.out.println("File doesn't exist.");
        }
        
    }
    
}
