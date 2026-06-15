import java.util.Scanner;
class Mobile
{
    String brand, model;
    float price;
    Scanner sc = new Scanner(System.in);
    Mobile()
    {
        System.out.println("Enter Mobile details: ");
        System.out.println("Enter Brand name: ");
        brand = sc.nextLine();
        System.out.println("Enter model name: ");
        model = sc.nextLine();
        System.out.println("Enter price: ");
        price = sc.nextInt();
    }
    void display()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
public class Mobile_class {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.display();
    }
}
