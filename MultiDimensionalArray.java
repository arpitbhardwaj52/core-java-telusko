import java.util.Random;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        
        /*
         * The syntax of multi dimensional array is : 
         * <DataType> <Name_Of_Array>[][] = new <DataType>[<Number of Rows>][<Number of Columns>];
         *      // The [][] can be placed after a space after Datatype or can be placed just after the array name.
         */

         int multiArray1[][] = new int[3][4];
         int [][] multiArray2 = new int[3][4];
         Random rand = new Random();

         for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                multiArray1[i][j]= rand.nextInt(100);
            }
         }

         for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                multiArray2[i][j]= (int)(Math.random()*100);
            }
         }

         for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<4;j++){
                System.out.print(" |"+multiArray1[i][j]+"| ");
            }
         }

         /*
          * Below is an example of forEach Loop. It will give you one value at a time, till the array is finished.
          Syntax is a follows:

            for(<DataType of Values present in the iterable> <Variable_Name> : <Name of Iterable>)
            
          */

         for (int i[]: multiArray2){
            System.out.println();
            for(int j:i){
                System.out.print(" |" + j + "| ");
            }
         }
    }
    
}
