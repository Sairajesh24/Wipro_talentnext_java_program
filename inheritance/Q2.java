package inheritance;


class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000.0, 2020, "ABC123");

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());
        System.out.println("Start Year: " + employee.getStartYear());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}
