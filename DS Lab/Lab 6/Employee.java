import java.util.*;

class Employee_Detail {
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;

    public Employee_Detail(int Employee_ID, String Name, String Designation, double Salary) {
        this.Employee_ID = Employee_ID;
        System.out.println("ID:"+Employee_ID);

        this.Name = Name;
        System.out.println("Name:");

        this.Designation = Designation;
        System.out.println("Designation:"+Designation);

        this.Salary = Salary;
        System.out.println("Salary:"+Salary);
    }
}

public class Employee {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the ID:");
       int ID = sc.nextInt();

       System.out.println("Enter the name:");
       String employee_name = sc.next();

       System.out.println("Enter the designation:");
       String desig = sc.next();

       System.out.println("Enter the Salary:");
       double salary = sc.nextDouble();

       Employee_Detail employee = new Employee_Detail(ID, employee_name, desig, salary);

       sc.close();
    }
}