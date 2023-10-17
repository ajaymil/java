
//*************matrix multipulication******************************


public class Mul {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        //a=array
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 2;
        a[1][1] = 4;
        //b=array
        b[0][0] = 5;
        b[0][1] = 6;
        b[1][0] = 6;
        b[1][1] = 7;
        //******************to a array*****************************
        System.out.println("array A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println(" ");

        }
        System.out.println("  ");
//************************to print b array******************
        System.out.println("array b");
        for (int I = 0; I < 2; I++) {
            for (int J = 0; J < 2; J++) {
                System.out.print(b[I][J] + "  ");
            }
            System.out.println(" ");

        }
        System.out.println(" ");

        //*************************to multiply a and b  put on c array *********************
       for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                c[x][y]=0;
                //this for to element in c

                System.out.print(c[x][y]+"   ");
            }
            System.out.println("  ");
        }
       // System.out.println(Arrays.deepToString(a));*/
    }
}
