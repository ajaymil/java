import java.util.*;
public class One_d {
    public static void main(String[] args) {
        Scanner OBJ=new Scanner(System.in);
        System.out.print("enter index of array  ");
        int ix=OBJ.nextInt();
        int a[]=new int[ix]; //getting index of array  
        System.out.println("Enter the elements of the Array");
        int s=0;
        for (int i = 0; i < ix; i++) {
          // taking array input
           a[i] = OBJ.nextInt();
           s=s+a[i];
           
        }
       // System.out.println(Arrays.toString(a));
        System.out.println("sum = "+s);
        

    }
}