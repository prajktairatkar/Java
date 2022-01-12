package two;
import java.util.*;
public class ConsVo {
	public static void main(String args[]) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character: ");
		ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(ch+ " It is vowel ");
			break;
			default:
				System.out.println("not an vowel");
		}
	}

}
