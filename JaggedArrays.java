public class JaggedArrays {
    public static void main(String[] args) {
        // Declaring a jagged array (each row has a different number of columns)
        int[][] jaggedArray = new int[3][];  

        // Defining different column sizes for each row
        jaggedArray[0] = new int[2];  // Row 0 has 2 columns
        jaggedArray[1] = new int[4];  // Row 1 has 4 columns
        jaggedArray[2] = new int[3];  // Row 2 has 3 columns

        // Filling the jagged array with values
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;  // Assigning values
            }
        }

        // Printing the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}