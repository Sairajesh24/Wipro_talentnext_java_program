package set;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> Employee=new HashSet<>();
		Employee.add("sai");
		Employee.add("sai");
		Employee.add("hima");
		Employee.add("shasa");
		
		Iterator<String> it=Employee.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
