import java.util.Scanner;

public class MTable {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Multiplication Table for: "+a);
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" X "+a+" = "+i*a);
        }
        sc.close();;
    }
}
