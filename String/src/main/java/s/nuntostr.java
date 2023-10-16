package s;


import java.util.Scanner;
public class nuntostr {
  
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        String num=obj.nextLine();
        int a=num.length();
        char c=num.charAt(0);
        
       
      
        
        String s="";
        String a1[]={"1","2","3","4","5","6","7","8","9"};
         String b[]={"11","12","13","14","15","16","17","18","19"};
        String numb[]={"one","two","three","four","five","six","seven","eight","nine"};
        String tens[]={"eleven","twelve","thirdteen","fourthteen","fifteen","sixteen","seventeen","eigthteen","nineteen"};
        String end_num[]={"10","20","30","40","50","60","70","80","90"};
        String zero[]={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eigthty","ninety"};
         if(a==3&&num.charAt(0)=='1'){
            System.out.println("hundred");
            
        
        }
        else if(a==2){
           // System.out.println("10-99");
          
           if(c=='1'){
             for(int j=0;j<b.length;j++){
                s=tens[j];
                 if(num.equals(b[j])&&s==tens[j]){
               System.out.println("number "+num+" is "+s);
                
                 }

                }
                    }
                    
           
          else if(c=='2'){
            
            for( int i=0;i<a1.length;i++){
                s=numb[i];
                 if(num.charAt(1) == a1[i].charAt(0) && s == numb[i]){
               System.out.println("number "+num+" is  twenty"+s);
                 } 
                }
                           

                    } 


                    else if (c == '3') {
                
                        for (int i = 0; i < a1.length; i++) {
                            s = numb[i];
                            if (num.charAt(1) == a1[i].charAt(0) && s == numb[i]) {
                                System.out.println("number " + num + " is thirty" + s);
                            }
                        }
                 }
                 else if (c == '4') {
                
                    for (int i = 0; i < a1.length; i++) {
                        s = numb[i];
                        if (num.charAt(1) == a1[i].charAt(0) && s == numb[i]) {
                            System.out.println("number " + num + " is forty" + s);
                        }
                    }
             }
             else if (c == '5') {
                
                for (int i = 0; i < a1.length; i++) {
                    s = numb[i];
                    if (num.charAt(1) == a1[i].charAt(0) && s == numb[i]) {
                        System.out.println("number " + num + " is fifty" + s);
                    }
                }
         }
         else if (c == '6') {
                
            for (int i = 0; i < a1.length; i++) {
                s = numb[i];
                if (num.charAt(1) == a1[i].charAt(0) && s == numb[i]) {
                    System.out.println("number " + num + " is sixty" + s);
                }
            }
     }
     else if (c == '7') {
                
        for (int i = 0; i < a1.length; i++) {
            s = numb[i];
            if (num.charAt(1) == a1[i].charAt(0) && s == numb[i]) {
                System.out.println("number " + num + " is seventy" + s);
            }
        }
 }
 else if (c == '8') {
                
    for (int i = 0; i < a1.length; i++) {
        s = numb[i];
        if (num.charAt(1) == a1[i].charAt(0) && s == numb[i]) {
            System.out.println("number " + num + " is eigity" + s);
        }
    }
}
else if (c == '9') {
                
    for (int i = 0; i < a1.length; i++) {
        s = numb[i];
        if (num.charAt(1) == a1[i].charAt(0) && s == numb[i]) {
            System.out.println("number " + num + " is ninety" + s);
        }
    }
}

if(num.charAt(1)=='0'){
    

    for (int i = 0; i < end_num.length; i++) {
        s = zero[i];
        if (num.equals(end_num[i]) && s == zero[i]) {
            System.out.println("number " + num + " is " + s);
        }
    }
}

                 
                }
                    

        
    
         else if(a==1){
            for( int i=0;i<a1.length;i++){
                s=numb[i];
                if(num.equals(a1[i])&&s==numb[i]){
               System.out.println("number "+num+" is "+s);
                 }
              
                    }
         }
        else{
            System.out.println("exceed value");
        }
        
    }
    
}