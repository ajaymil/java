import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);  
          
         
          
        System.out.println("Enter a String value:");  
        String str = sc.nextLine();  
          
        System.out.println("Enter Integer value:");  
        int Data = sc.nextInt();  
          
        System.out.println("Enter Character value:");  
        char D = sc.next().charAt(0); 
         System.out.println(Data + " is of type " + ((Object)Data).getClass().getSimpleName()); 
         System.out.println(D + " is of type " + ((Object) D).getClass().getSimpleName()); 
        System.out.println(str + " is of type " + str.getClass().getSimpleName()); 
    }
}
