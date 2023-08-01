package FlowControlStatements;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the month in numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
//		String Month;
		switch(n) {
			case 1:
				System.out.println("Jan");
				break;
			case 2:
				System.out.println("feb");
				break;
			case 3:
				System.out.println("mar");
				break;
			case 4:
				System.out.println("apr");
				break;
			case 5:
				System.out.println("may");
				break;
			case 6:
				System.out.println("Jun");
				break;
			case 7:
				System.out.println("Jul");
				break;
			case 8:
				System.out.println("aug");
				break;
			case 9:
				System.out.println("sep");
				break;
			case 10:
				System.out.println("oct");
				break;
			case 11:
				System.out.println("nov");
				break;
			case 12:
				System.out.println("dec");
				break;
			default:
				System.out.println("Invalid month");
				break;
		}
		
	}

}
