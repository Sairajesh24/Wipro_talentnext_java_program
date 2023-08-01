package string_and_stringBuffer;

public class Q3 {

	public static void main(String[] args) {
		String s5="wipro";
		int n=s5.length();
		String firstTwoChars = s5.substring(0, 2);
        System.out.println(firstTwoChars.repeat(n));

	}

}
