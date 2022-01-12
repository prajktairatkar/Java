// happy number is the sum of the square of digits is equal to 1//

package loop;
import java.util.*;
public class Hap1 {
	public static void main(String[] args)
    {
        int number, remainder = 1, temp, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        number = sc.nextInt();
        temp = number;
        while (number > 9)
        {
            while (number > 0)
            {
                remainder = number % 10;
                sum = sum + (remainder * remainder);
                number = number / 10;
            }
            number = sum;
            sum = 0;
        }
        if (number == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
    }
}
