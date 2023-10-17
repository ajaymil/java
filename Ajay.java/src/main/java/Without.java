

public class Without {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        a[0][0] = 3;
        a[0][1] = 0;
        a[0][2] = 6;
        a[1][0] = 2;
        a[1][1] = 3;
        a[1][2] = 0;
        a[2][0] = 1;
        a[2][1] = 2;
        a[2][2] = 3;


        System.out.println("\n");

        for ( int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++) {
               // System.out.print(a[i][j] + " ");
                if (a[i][j] == 5) {
                    System.out.println("a="+a[i][j]);
                }
            }


            System.out.println("");
        }


//System.out.println(Arrays.deepToString(a));

    }
}
