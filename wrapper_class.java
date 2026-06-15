public class wrapper_class {
    public static void main(String[] args) {
        int num = 10;

        // Boxing
        Integer obj = Integer.valueOf(num);

        // Unboxing
        int n = obj.intValue();

        System.out.println(obj);
        System.out.println(n);
    }
}
//coverts primitive datatypes to objects

