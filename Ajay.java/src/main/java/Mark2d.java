
 import java.util.Arrays;
public class Mark2d {

    public static void main(String[] args) {

        int rows = 100;
        int cols = 5;


        int[][] myArray = new int[rows][cols];//2d array
        int finale[] = new int [myArray.length];//1D ARRAY
//*****************************************************
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                myArray[i][j] = i * cols + j + 1;// assigning the value
            }
        }
        System.out.println(Arrays.deepToString(myArray));
//****************************************************************
      /* Print the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray[i][j] + "   ");
            }
            System.out.println();
        }*/
//***********************************************

            for (int i = 0; i < myArray.length; i++) {
                int rowSum = 0; // Initialize the sum for each row
                for (int j = 0; j < myArray[i].length; j++) {
                    rowSum =rowSum+ myArray[i][j];
                  //  System.out.println("row in "+i+"in"+rowSum);

                  finale[i] = rowSum;

                }

            }
                System.out.println(Arrays.toString(finale));


    }
}

