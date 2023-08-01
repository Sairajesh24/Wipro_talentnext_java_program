package FlowControlStatements;
import java.util.*;

class evenOrOdd{
	int n;
	void display() {
		if(n%2==0) {
			System.out.println("even");			
		}
		else {
			System.out.println("Odd");
		}
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		evenOrOdd m=new evenOrOdd();
		System.out.println("enter the number:");
		m.n=scanner.nextInt();
		scanner.close();
		
		m.display();
		
	}

}
