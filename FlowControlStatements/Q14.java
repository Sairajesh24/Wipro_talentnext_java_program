package FlowControlStatements;
import java.util.*;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum +=r;
			n/=10;
		}
		System.out.println("sum is:"+ sum);
		
	}

}
