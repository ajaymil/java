public class Ex3 {
    public static void main(String[] args) {
        String I[]={"apple","ice","mango","strawberry"};
        String II[]={"banana","ice","rashberry","mango"};
        for (int i=0;i<I.length;i++){
            for (int j=0;j<II.length;j++){
                if (I[i] == II[j]) {
                    System.out.println(I[i]+"is common ");
                }
            }

            }

    }
}
