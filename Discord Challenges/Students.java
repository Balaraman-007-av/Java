import java.util.Scanner;

class Students_details{
    int rollno;
    String name, dept;

    void store_data(int rollno, String name, String dept)
    {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
    }

    void display()
    {
        System.out.println("Rollno: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
    }
}

public class Students{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Students_details[] obj = new Students_details[n];//allocates n references
        for(int i=0;i<n;i++)
        {
            obj[i] = new Students_details(); //allocates memory for object
            System.out.println("Enter details for student "+(i+1));
            System.out.println("Enter rollno: ");
            int rollno = sc.nextInt();
            System.out.println("Enter name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter Department");
            String dept = sc.nextLine();
            obj[i].store_data(rollno, name, dept);
        }
        System.out.println("Student Details: ");
        for(int i=0;i<n;i++)
        {
            obj[i].display();
        }
        sc.close();     
    }
}

