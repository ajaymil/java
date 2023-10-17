import java.util.Arrays;

public class Greaterarr  {
    public static void main(String[] args) {
      int a[][]={{1,2,3},{4,5,6}};
      int s=0;
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
          
                    s=s+ a[i][j];
                 
System.out.print(a[i][j]+" ");
        }
     System.out.println(    " ");
      
      }

System.out.println(Arrays.sort(a));
    }
}
    
      
        

    

    
    

