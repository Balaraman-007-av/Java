import java.util.Scanner;

public class LO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x;
        if(a>b && a>c) x=a;
        else if(b>c) x=b;
        else x=c;

        System.out.println("Greatest Value: "+x);
        sc.close();
    }
}
