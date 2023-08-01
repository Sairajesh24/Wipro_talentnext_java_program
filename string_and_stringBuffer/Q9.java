package string_and_stringBuffer;

public class Q9 {
    public static String combineStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String combinedString = combineStrings(a, b);
        System.out.println(combinedString);
    }
}
