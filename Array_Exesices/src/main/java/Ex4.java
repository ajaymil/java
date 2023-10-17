//import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
int mat_a[][]={{5,6},
                  {4,5}};
        int mat_b[][]={{4,8},
                               {2,5}};
        int c[][] =new int [2][2];
        for(int i=0;i<mat_a.length;i++){
            for(int j=0;j<mat_b.length;i++){
                c[i][j]=0;
                for(int k=0;k<3  ;k++){
                    c[i][j]=mat_a[i][k]+mat_b[i][k];
                    c[i][j]=mat_a[k][j]+mat_b[k][j];

                }
                System.out.print(c[i][j]+"  ");
            }
            System.out.println("  ");
        }



        }
    }
