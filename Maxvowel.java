package one;
import java.util.*;
public class Maxvowel {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String str ;
    str= sc.nextLine();
    str = str + " ";
    
	String word = "", mWord = "";
    int count = 0, maxCount = 0;
   for (int i = 0; i < str.length(); i++) {
        
        char ch = (str.charAt(i));
        
        if (ch == 'A' ||
            ch == 'E' ||
            ch == 'I' ||
            ch == 'O' ||
            ch == 'U') {
            count++; 
        }
        
        if (ch == ' ') {
            if (count > maxCount) {
                maxCount = count;
                mWord = word;
            }
            word = "";
            count = 0;
        }
        else {
            word += ch;
        }
    }
    
    System.out.println("The word with maximum number of vowels: "
                        + mWord);
}
}
