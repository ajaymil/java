import java.util.Arrays;

public class Binary {

    public static void main(String[] args) {


        String freind[] = {"ajay", "vimal", "aahi", "abi", "babu", "raju"};
        Arrays.sort(freind);// sorting array;
        System.out.println(Arrays.toString(freind));
        Arrays.binarySearch(freind, "abi");
        System.out.println(Arrays.deepToString(freind));
        int a=freind.length;//lenght of arrays

        System.out.println(a);
    }
}