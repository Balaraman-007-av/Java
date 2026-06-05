import java.util.Scanner;

public class Sum10 {
    public static void main(String[] args) {

        int sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");

        for(int i=0;i<10;i++)
            sum+=sc.nextInt();

        System.out.println("Sum = " + sum);

        sc.close();
    }
}