import java.util.Arrays;
import java.util.Scanner;
public class Sum2d {
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
        System.out.print("Enter the row of multidimensional array");
        Scanner ob= new Scanner(System.in);
       int n= ob.nextInt();
     finale = myArray[n];
        System.out.println(Arrays.toString(finale));
        int s=0;
        for (int a=0;a<finale.length;a++)
        {
           s=s+finale[a];

        }
        System.out.println(+s);
    }
}
