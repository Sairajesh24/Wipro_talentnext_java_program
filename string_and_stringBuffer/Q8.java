package string_and_stringBuffer;

public class Q8 {

	public static void main(String[] args) {
		String s11="ab*cd";
		int n=s11.indexOf('*');
		if ((0==n-1) && (s11.length()-1==n+1)) {
			System.out.println("empty");
		}
		else if (0==n-1) {
			System.out.println(s11.substring(n+1, s11.length()));
		}
		else if (s11.length()-1==n+1) {
			System.out.println(s11.substring(0, n-1));
		}
		else {
			System.out.println(s11.substring(0, n-1)+s11.substring(n+1, s11.length()));
		}
	}

}
