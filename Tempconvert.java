import java.util.Scanner;
public class Tempconvert{
    public static void main(String[] args) {
        System.out.println("Do you want Fahrenheit[f] or Celsius[c]");
    Scanner obj=new Scanner(System.in);
    char T=obj.next().charAt(0);
    Scanner con=new Scanner(System.in);
      switch ((Character.toLowerCase(T)))

       {
            case 'f':
           
            System.out.print("Give the Celsius[c] value to convert Fahrenheit="); 
             double C=con.nextDouble();
             
             double Fahrenheit=(9*C+(32*5))/5;
             con.nextLine();
System.out.println("Fahrenheit= "+Fahrenheit+"F");
                break;
                case 'c':
                
                System.out.print("Give the Fahrenheit[f] value to convert Celsius[c] ="); 
                 double F=con.nextDouble();
                 
                 double Celsius=(5*(F-32))/9;
                 con.nextLine();
    System.out.println("Celsius= "+Celsius+"C");
    break;
            default:
            
                System.out.println(T+ "is not a temperature");
        } 
    }
}