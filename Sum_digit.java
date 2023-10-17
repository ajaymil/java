import java.util.Scanner;
public class Sum_digit {
    public static void main(String[] args) {
        System.out.print("ENTER 0 to 1000 number=  ");
        Scanner obj=new Scanner(System.in);
        int i=obj.nextInt();  
        
double a=i%10;
double r=i/10;
double b=r%10;
    r=r/10;
double c=r%10;
    r=r/10;
 double d=r%10;
    
double sum=a+b+c+d;
System.out.print("sum of digit= "+sum);


    }
}
