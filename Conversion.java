/**
 * This program demonstrates widening type conversion
 * from int to long and long to float.
 *
 * @author Balaraman
 * @version 1.0
 */
public class Conversion {

    /**
     * Default constructor for the Conversion class.
     */
    public Conversion() {
    }

    /**
     * Main method of the program.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        int i = 100;
        long l = i;      // int to long conversion
        float f = l;     // long to float conversion

        System.out.println("Int value   : " + i);
        System.out.println("Long value  : " + l);
        System.out.println("Float value : " + f);
    }
}