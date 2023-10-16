package s;
import java.util.Scanner;
public class String_task {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String ans="";
        System.out.print(" enter num 0-9 ");
        String a=ob.nextLine();
         String a1[]={"0","1","2","3","4","5","6","7","8","9"};
        String num[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String s="";
        for( int i=0;i<a1.length;i++){
            s=num[i];
             if(a.equals(a1[i])&&s==num[i])
           System.out.println("number "+a+" is "+s);
                         
                }
               
            }
          
        }

    

