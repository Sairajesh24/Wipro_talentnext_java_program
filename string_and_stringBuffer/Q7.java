package string_and_stringBuffer;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s10="xhi";
		if(s10.startsWith("x")==s10.endsWith("x")) {
			System.out.println(s10.substring(1, s10.length()-1));
		}
		else if(s10.startsWith("x")) {
			System.out.println(s10.substring(1, s10.length()));
		}
		else if(s10.endsWith("x")) {
			System.out.println(s10.substring(0, s10.length()-1));
		}
		else {
			System.out.println(s10);
		}
	}

}
