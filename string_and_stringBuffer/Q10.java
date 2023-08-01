package string_and_stringBuffer;

public class Q10 {
    public static String repeatLastCharacters(String str, int n) {
        int length = str.length();
        String lastNCharacters = str.substring(length - n);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNCharacters);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "CHINMAYA";
        int n = 3;
        String repeatedString = repeatLastCharacters(str, n);
        System.out.println(repeatedString);
    }
}
