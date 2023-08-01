package FlowControlStatements;
import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println("\n");
		}
	}

}
