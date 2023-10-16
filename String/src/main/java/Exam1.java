import java.util.Scanner;
 public class Exam1 {
    public static void main(String[] args) {
Scanner ip=new Scanner(System.in);
        System.out.print("enter the String ");
        String s=ip.nextLine();
        char rev=' ';
        String strrev="";

        for (int i=s.length()-1;i>=0;i--)
        {
        rev=s.charAt(i);
strrev+=rev;

        }

        if(s.equals(strrev)){
            System.out.println(" palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}
