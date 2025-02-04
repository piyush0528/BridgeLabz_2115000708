public class Employee {
    static String companyName = "Tech Innovations Inc."; 
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
  System.out.println("Employee ID: " + id);
System.out.println("Designation: " + designation);
} else {
System.out.println("This is not a valid Employee object.");
}
}

public static void main(String[] args) {
Employee employee1 = new Employee("John Doe", "Software Engineer", 101);
Employee employee2 = new Employee("Jane Smith", "Project Manager", 102);

 displayTotalEmployees();
employee1.displayEmployeeDetails();
employee2.displayEmployeeDetails();
}
}
