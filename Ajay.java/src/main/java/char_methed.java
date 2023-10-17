public class char_methed {
    public static void main(String[] args) {
        String str="Hello";
        int c=str.codePointAt(0);
        System.out.println(c);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int d=212;
        char v=(char)d;
        System.out.println("v="+v);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
char vlc=5;
boolean isDigit=Character.isDigit(vlc);
        System.out.println("vlc="+vlc);
        boolean isLetter=Character.isLetter(vlc);
        System.out.println("vlc="+vlc);

        char myChar = 'a';
        char m = 'Z';
        char lowercaseChar = Character.toLowerCase(m); // Converts 'a' to 'a'
        char uppercaseChar = Character.toUpperCase(myChar); // Converts 'a' to 'A'
        System.out.println(uppercaseChar);
        System.out.println(lowercaseChar);


    }
}
