import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {
        Scanner An=new Scanner(System.in);
        for(int i=0;i<=50;i++){
        System.out.print("enter the string  ");
        String str=An.nextLine();
        System.out.println("\n");
        System.out.println("choices are ");
        System.out.println("---+-------------------------+----------------------+----------------------");
        System.out.println("1. Upper case the String");
        System.out.println("2. Lower case the String ");
        System.out.println("3. trim the space");
        System.out.println("4. replace the String");        
        System.out.println("5. check specfic string in main String");
        System.out.println("6. to find the length of String");
        String str2="";
        System.out.println("enter the choice:--\n");
        Scanner ops=new Scanner(System.in);
        int ch=ops.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println(str.toUpperCase());
            break;
            case 2:
             System.out.println(str.toLowerCase());
             break;
            case 3:
             System.out.println(str.trim()); 
             break;
             case 4:
             str2=An.nextLine();
             System.out.println(str.replace(str, str2)); 
             break;
             case 5:
             
             System.out.println(str.contains(str2)); 
             break;
             case 6:
             System.out.println(str.length()); 
             break;
             default:
             System.out.println("none of these above");

            
        }
        System.out.println("\n");
    }
    }    
}
