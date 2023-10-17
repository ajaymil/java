import java.util.Scanner;
public class Time{
    public static void main(String[] args) {
        int a= 60*24*365;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter minute");
        double min= obj.nextDouble();
        long year = (long)(min/a);
        int day=(int)(min/60/24)%365;
        System.out.println((int)min+"in year is"+year+"  day is"+day);
    }  
}
