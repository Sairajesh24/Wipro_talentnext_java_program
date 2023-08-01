package string_and_stringBuffer;
import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("type a word:");
		String s1 = sc.nextLine();
		sc.close();
		StringBuilder sb = new StringBuilder(s1);

		if (s1.equals(sb.reverse().toString())) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}
