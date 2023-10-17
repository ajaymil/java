import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        System.out.print("Enter the Number ;");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int row , col;
        for(row=1;row<=num;row++)
        {
            for(col=1;col<=row;col++)
            {
                System.out.print(+row);
            }
            System.out.println(" ");
        }

    }

}
