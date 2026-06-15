public class JaggedArray {
    public static void main(String[] args) {

        // Create a jagged array with 3 rows
        int[][] marks = new int[3][];

        // Assign different sizes to each row
        marks[0] = new int[] {85, 90, 78};
        marks[1] = new int[] {92, 88};
        marks[2] = new int[] {75, 80, 85, 95};

        // Print the jagged array
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}