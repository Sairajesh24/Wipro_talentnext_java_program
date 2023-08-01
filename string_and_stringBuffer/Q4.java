package string_and_stringBuffer;

public class Q4 {
    public static void main(String[] args) {
        String s6 = "Tomcat";
        if (s6.length() % 2 == 0) {
            System.out.println(s6.substring(0, s6.length() / 2));
        } else {
            System.out.println("null");
        }
    }
}