
import java.util.Arrays;

public class Rev {
    public static void main(String[] args) {


        int a[] = {2, 5, 6, 8, 9, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i=5;i>=0;i--)
        {

            System.out.println(a[i]);

        }
    }
}
