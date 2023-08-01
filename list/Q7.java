package list;
import java.util.*;

class Employee1{
	String name;
	int age;
	
	public  Employee1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Employee1> employeeVector= new Vector<>();
		
		employeeVector.add(new Employee1("sai",23));
		employeeVector.add(new Employee1("hima",22));
		employeeVector.add(new Employee1("sha",21));
		
		 // Iterate using Iterator
        System.out.println("Using Iterator:");
        Iterator<Employee1> iterator = employeeVector.iterator();
        while (iterator.hasNext()) {
            Employee1 employee = iterator.next();
            System.out.println("Name: " + employee.getName() + ", ID: " + employee.getAge());
        }

        // Iterate using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee1> enumeration = employeeVector.elements();
        while (enumeration.hasMoreElements()) {
            Employee1 employee = enumeration.nextElement();
            System.out.println("Name: " + employee.getName() + ", ID: " + employee.getAge());
        }
	}

}
