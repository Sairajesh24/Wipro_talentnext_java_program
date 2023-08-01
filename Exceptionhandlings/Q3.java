package Exceptionhandlings;
import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {

			System.out.println("enter the number of  integer element in the array");
			int length = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the mark of student  in integer :");
			int[] arr=new int[length];
			for(int i=0;i<length;i++) {
				arr[i] = Integer.parseInt(sc.nextLine());
			}
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			int avg=sum/arr.length;
			System.out.println("The average mark of student is: " + avg);

		} catch(NumberFormatException e) {
			System.out.println("number format expression is occured");
		}
		sc.close();
	}

}