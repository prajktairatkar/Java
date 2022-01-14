package loop;
import java.util.*;
public class SumFactor {
	public static void main(String arrgs[]) {
		float sum = 0.0f;
		int i,n, j,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
	n = sc.nextInt();
	for(i=1;i<n;i++) {
		for(j=1;j<=i;j++) {
			fact= fact *j;
		}
		sum=sum+((float)1/fact);
	}
	System.out.println(" sum of the series is" +sum);
	
	}
	

}
