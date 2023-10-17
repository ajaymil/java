import java.util.Scanner;
public class Inch {
    public static void main(String[] args) {
        System.out.print("ENTER A INCH=  ");
        Scanner obj=new Scanner(System.in);
        float inch=obj.nextFloat();
        double m=inch*0.0254;
        System.out.println(inch+" is equal to  "+m+" meter" );
    }
}
