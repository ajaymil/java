import java.util.Arrays;
public class Copyarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int b[]=Arrays.copyOf(a,6);
        System.out.println(Arrays.toString(b));


    }
}
