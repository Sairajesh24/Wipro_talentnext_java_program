package list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee() {
    }

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println(empId + "\t" + empName + "\t" + gender + "\t" + salary);
    }
}

class Q2 {
    public ArrayList<Employee> list = new ArrayList<Employee>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        int choice = 0;
        Q2 db = new Q2();
        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Payslip");
            System.out.println("4. List Employees");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            try (Scanner sc = new Scanner(System.in)) {
				choice = sc.nextInt();
				switch (choice) {
				    case 1:
				        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				        Employee e = new Employee();
				        System.out.println("Enter Employee ID: ");
				        e.empId = Integer.parseInt(br.readLine());
				        System.out.println("Enter Employee Name: ");
				        e.empName = br.readLine();
				        System.out.println("Enter Email: ");
				        e.email = br.readLine();
				        System.out.println("Enter Gender: ");
				        e.gender = br.readLine();
				        System.out.println("Enter Salary: ");
				        e.salary = Float.parseFloat(br.readLine());
				        if (db.addEmployee(e)) {
				            System.out.println("Employee Added");
				        } else {
				            System.out.println("Error in Adding Record");
				        }
				        break;
				    case 2:
				        System.out.println("Enter Employee ID: ");
				        int id = sc.nextInt();
				        if (db.deleteEmployee(id)) {
				            System.out.println("Employee Removed");
				        } else {
				            System.out.println("Error in removing Record");
				        }
				        break;
				    case 3:
				        System.out.println("Enter Employee ID: ");
				        id = sc.nextInt();
				        String pslip = db.showPaySlip(id);
				        System.out.println(pslip);
				        break;
				    case 4:
				        db.listEmployees();
				        break;
				    case 5:
				        System.exit(0);
				    default:
				        System.out.println("Invalid Choice");
				}
			}
        } while (choice != 5);      
    }

    private boolean deleteEmployee(int id) {
        boolean status = false;
        if (list.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            Iterator<Employee> it = list.iterator();
            while (it.hasNext()) {
                Employee emp = it.next();
                if (emp.empId == id) {
                    it.remove();
                    status = true;
                }
            }
        }
        return status;
    }

    private String showPaySlip(int id) {
        String msg = "No record found";
        if (list.isEmpty()) {
            System.out.println("No record found");
        } else {
            for (Employee emp : list) {
                if (emp.empId == id) {
                    msg = "Emp ID: " + emp.empId + "\n" + "Name: " + emp.empName + "\n" + "Salary: " + emp.salary;
                }
            }
        }
        return msg;
    }

    private void listEmployees() {
        if (list.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Emp ID\tEmp Name\tGender\tSalary");
            for (Employee emp : list) {
                emp.getEmployeeDetails();
            }
        }
    }

    boolean addEmployee(Employee e) {
        boolean status = list.add(e);
        return status;
    }
    
}
