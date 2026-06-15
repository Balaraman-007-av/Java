import java.util.Scanner;

record Student(int rollno, String name, String dept) {}

public class Students_Details{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] obj = new Student[n];
        for(int i=0;i<n;i++)    
        {
            System.out.println("Enter details for student "+(i+1)+" :");
            System.out.print("Enter rollno: ");
            int rollno = sc.nextInt();
            System.out.print("Enter name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter Department: ");
            String dept = sc.nextLine();
            obj[i]=new Student(rollno, name, dept);
        }
        System.out.println("\nStudent Details: \n");
        for(int i=0;i<n;i++)
        {
            System.out.println("Student "+(i+1)+" details :");
            System.out.println("Rollno: "+obj[i].rollno());
            System.out.println("Name: "+obj[i].name());
            System.out.println("Department: "+obj[i].dept()+"\n");
        }
        sc.close();     
    }
}
