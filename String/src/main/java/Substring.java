
import java.util.Scanner;
public class Substring {
     public static void main(String []args){
        System.out.println("Student information ");
        Scanner ob=new Scanner (System.in);
        System.out.print("sno        =        ");
        byte a=ob.nextByte();
        ob.nextLine();
        System.out.print("name       =             ");
        String b=ob.nextLine();
        System.out.print("regno      =        ");
        long c =ob.nextLong(); 
        System.out.print("bill_no    =        ");
        short d=ob.nextShort(); 
        System.out.println("\n");
         System.out.println("sno        =        "+a);
         System.out.println("name       =        "+b);
         System.out.println("regno      =        "+c);
         System.out.println("bill_no    =        "+d);
     }

}
