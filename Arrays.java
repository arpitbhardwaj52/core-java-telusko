import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        Scanner scanner = new Scanner(System.in);
        /*
         * The syntax for arrays is : 
         * 
         * <Datatype> Name_of_Array = {<elements,of,the,array,seperated,by,commas>}; // No need to specify the size of array.
         * 
         * <Datatype> Name_of_Array = new <Datatype>[<Size of the Array>]; // Need to specify the size while declaring.
         * 
         * 
         */
        int [] array1 = {1,2,3,4,5};
        int [] array2 = new int[5];
        int [] array3 = new int[5];

        for(int i=0; i<5; i++){
            System.out.println("Enter the array2 element for index " + i + " : ");
            int element= Integer.parseInt(br.readLine());
            array2[i]=element;            
        }

        for(int i=0; i<5; i++){
            System.out.println("Enter the array3 element for index " + i + " : ");
            int element = scanner.nextInt();
            array3[i]=element;            
        }

        System.out.print("Array1 contains : ");
        for (int i=0;i<5;i++){
            System.out.print("| " + array1[i] + "| ");
        }
        System.out.println();


        System.out.print("Array2 contains : ");
        for (int i=0;i<5;++i){
            System.out.println(" |" + array2[i] + "| ");
        }
        System.out.println();

        System.out.print("Array3 contains : ");
        for (int i=0;i<5;++i){
            System.out.println(" |" + array3[i] + "| ");
        }
        System.out.println();

        scanner.close();



    }
    
}
