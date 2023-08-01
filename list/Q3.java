package list;
import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {

    private static ArrayList<String> month = new ArrayList<>();

    public static void main(String[] args) {
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC"};

        for (int i = 0; i < months.length; i++) {
            month.add(months[i]);
        }

        Q3 q3 = new Q3();
        q3.printAll();
    }

    public void printAll() {
        Iterator<String> it = month.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
