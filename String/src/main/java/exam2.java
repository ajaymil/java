import java.util.Scanner;
public class exam2 {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.print("enter name  ");
        String name=ab.nextLine();
                for(int i=name.length()-1;i>=0;i--){
                    System.out.print(name.charAt(i));
                }

    }
}
