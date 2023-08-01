package list;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> months=new ArrayList<>();
		String[] month= {"JAN","FEB","MAR","APR","MAY","JUN","JULY","AUG","SEP","OCT","NOV","DEC"};
		
		for (int i=0;i < month.length;i++) {
			months.add(month[i]);
		}
		for (String m : months) {
            System.out.println(m);
        }
	}

}
