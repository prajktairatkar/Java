//Write a program to input a sentence and display the word of the sentence that contains maximum number of vowels

package one;
import java.util.*;
public class Printwordswithmaxvowels {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		s = sc.nextLine();
		s = s + " ";
		String word="", maxword="";int count = 0 ,maxcount = 0;
for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            
            if (ch == 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U') {
                count++; 
            }
            
            if (ch == ' ') {
                if (count > maxcount) {
                    maxcount = count;
                    maxword = word;
                }
                word = "";
                count = 0;
            }
            else {
                word += ch;
            }
        }
        
        System.out.println("The word with maximum number of vowels: "
                            + maxword);
    
		
		
		
		
	}

}
