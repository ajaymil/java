public class hello_java{
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
int t=4;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == t) {

                System.out.println("Element " + t + " found at index " + i);
                break; // Exit the loop once the element is found
            }
        }

    }
}
