public class Ex2 {
    public static void main(String[] args) {
        String srr[]={"1","2","3","4","5","6","8","8","5","2","7","4","7"};
        for(int i=0;i< srr.length;i++){
            for(int j=0;j< srr.length;j++){
                if((srr[i]==srr[j]&&i!=j)){
                    System.out.println("dub  "+srr[j]);
                }
            }
        }

    }
}
