import java.util.Arrays;
import java.util.Collections;
public class array {
    public static void main(String[] args) {
        //*****************************SORTING*********************************************************
   /*  char a[] = {'S', 'u', 'l', 'm', 'a', 'n'};// charcter
        Arrays.sort(a);// sorting array;
        System.out.println(Arrays.toString(a));*/
      /*  int b[] = {'s', 'u', 'l', 'm', 'a', 'n'};
        Arrays.sort(b);// sorting array;
        System.out.println(Arrays.toString(b));
        Arrays.sort(a,2,5 );
        System.out.println(Arrays.toString(a));
        //***********************************************************************
        String freind[] = {"ajay","vimal","aahi","abi","babu","raju"};
        Arrays.sort(freind);// sorting array;
        System.out.println(Arrays.toString(freind));
        Arrays.binarySearch(freind,"abi");//
        System.out.println(Arrays.deepToString(freind));*/

        //**************************************************************
       int num[] = {0,6,95,100,150,65,80,90,40,56,85};
        int L=num.length;  // checking length og array
        System.out.println(L);

      //  Arrays.sort  (num, Collections.reverseOrder()); sorting array;
      /*
        System.out.println(Arrays.toString(num));*/
        /*int[] N = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(N)); */
       // int index = Arrays.binarySearch(N, 4);
//System.out.println("["+index+"]");*/
       /* int[] source = {1, 2, 3};
        int[] copy = Arrays.copyOf(source, 10); // Creates a new array with a length of 5
        System.out.println(Arrays.toString(copy));
       copy = Arrays.copyOfRange(num, 5, 8);
        System.out.println(Arrays.toString(copy));*/
        /*char[] characters = new char[5];
        Arrays.fill(characters, 'X');       // Fills the array with 'X'
        System.out.println(Arrays.toString(characters));*/
      /*  int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(arr1, arr2); // Returns true
        System.out.println(areEqual);*/
    }
}
