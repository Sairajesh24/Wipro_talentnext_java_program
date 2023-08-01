package list;
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> n=new ArrayList<>();
		
        // Alternative way to add elements using addAll()
        List<Number> additionalNumbers = Arrays.asList(7, 2.71828, 4.7f);
        n.addAll(additionalNumbers);
        
        System.out.println(n);
	}

}
