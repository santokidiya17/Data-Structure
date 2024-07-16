import java.util.*;

class Student_Detail {
    int Enrollment_NO;
    String Name;
    int Semester;
    double CPI;

    public Student_Detail(int Enrollment_NO, String Name, int Semester, double CPI) {
        this.Enrollment_NO = Enrollment_NO;
        this.Name = Name;
        this.Semester = Semester;
        this.CPI = CPI;
        
    }

    public void display(){
        System.out.println("ID:" + Enrollment_NO);
        System.out.println("Name:");
        System.out.println("Semester:" + Semester);
        System.out.println("CPI:" + CPI);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student_Detail s[] = new Student_Detail[5];

        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter the ID:");
            int ID = sc.nextInt();

            System.out.println("Enter the name:");
            String student_name = sc.next();

            System.out.println("Enter the Semester:");
            int sem = sc.nextInt();

            System.out.println("Enter the CPI:");
            double cpi = sc.nextDouble();

            s[i] = new Student_Detail(ID, student_name, sem, cpi);
        }

        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
        sc.close();
    }
}