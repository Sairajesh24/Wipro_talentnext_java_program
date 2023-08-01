package FlowControlStatements;
import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter a charecter:");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		sc.close();
		
		if(Character.isLowerCase(ch)) {
			System.out.print(Character.toUpperCase(ch));
		}
		else if(Character.isUpperCase(ch)){
			System.out.print(Character.toLowerCase(ch));
		}
	}

}
