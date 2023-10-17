import java .util.Arrays;

public class Sort2D {
    public static void main(String[] args) {
        int[][] my = {
                {2, 4, 8},
                {3, 6, 9},
                {1, 2, 3}
        };
        for (int i=0;i< my.length;i++){
            for (int j=0;j<my[0].length;j++){
                System.out.print(my[i][j]+"  ");
            }
            System.out.println(" ");
        }
        //System.out.println(Arrays.deepToString(my));



    }
}
