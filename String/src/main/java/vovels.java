

import java.util.Scanner;
public class vovels {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println( "enter String=");
        String a=input.nextLine();
        String lw=  a.toLowerCase();
       
        char n=' ';
        String con="";
        char s=' ';
        char S=' ';
        String vol="";
        char v[]={'a','e','i','o','u'};
        char arr[] = new char[lw.length()];
        for (int i=0;i<lw.length();i++) {
            s = lw.charAt(i);
            for (int j=0;j<v.length;j++){
                if(lw.charAt(i) == v[j]) {
                    vol = vol + lw.charAt(i);
                    break;
                }
                  
            }

        }
       // System.out.println(vol);
        System.out.println("lenght of vovel= "+vol.length()+" vovel in "+a+" is  = "+vol);
       /* System.out.println("");
        System.out.println(Arrays.toString(arr));*/
         System.out.println("\n");
        
        
        char w[]={'b', 'c', 'd', 'y', 'g', 'j', 'k','h', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z'};

        for (int i=0;i<lw.length();i++) {
            S = lw.charAt(i);
            for (int j=0;j<w.length;j++){
                if(lw.charAt(i)==w[j]) {
                    con = con + lw.charAt(i);
                    break;
                }
            }

        }
        System.out.println(con);
        System.out.println("lenght of con= "+con.length()+" con in "+a+"is  = "+con);
    }
}
