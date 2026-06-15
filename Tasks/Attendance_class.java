class Attendence{
    int reg_no;
    String name;
    float Att_Percentance=75;
    Attendence(int reg_no, String name)
    {
        this.reg_no = reg_no;
        this.name = name;
    }

    Attendence(int reg_no, String name,float Att_Percentance)
    {
        this.reg_no = reg_no;
        this.name = name;
        this.Att_Percentance = Att_Percentance;
    }
    void display()
    {
        System.out.println("Reg_no: "+reg_no+"\n"+"Name: "+name+"\n"+"Attendence Percentage: "+Att_Percentance);
    }
}
public class Attendance_class {
    public static void main(String[] args) {    
        Attendence obj1 = new Attendence(101,"Bala");
        Attendence obj2 = new Attendence(102, "Ram", 89);
        obj1.display();
        obj2.display();
    }
}
