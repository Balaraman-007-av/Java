import java.util.Scanner;

public class CDN {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int digit=0;
        while(a>0)
        {
            a/=10;
            digit++;
        }
        System.out.println("Number of digits: "+digit);
    }
    
}
