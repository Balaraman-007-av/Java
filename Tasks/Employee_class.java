class Employee{
    int emp_id;
    String name;
    double salary=10000;
    Employee(int emp_id, String name)
    {
        this.emp_id = emp_id;
        this.name = name;
    }

     Employee(int emp_id, String name,double salary)
    {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }
    void display()
    {
        System.out.println("EMP_ID: "+emp_id+"\n"+"Name: "+name+"\n"+"Salary: "+salary);
    }
}
public class Employee_class {
    public static void main(String[] args) {
        Employee obj1 = new Employee(101,"Bala");
        Employee obj2 = new Employee(102,"Ram",200000);
        obj1.display();
        obj2.display();
    }
}
