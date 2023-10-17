public class Method {
    public static void main(String[] args) {
        String a="adithi";
        char c=a.charAt(3);// identify the character  in given string
        System.out.println(c);
        System.out.println("\n");

        //**************************************************************
        int b=a.length();
        System.out.println(b);// to print lenght of String.
        System.out.println("\n");
        char d=a.charAt(b-1);
        System.out.println(d);
        System.out.println("\n");
        //*******************************************************************
  // uppercase() & Lowercase
        System.out.println(a.toUpperCase());
        System.out.println("\n");
        //*******************************************************************
        //trim
        String tr= "ajay";
        String t="Ajay";
        System.out.println(tr);
        System.out.println(tr.trim());
        System.out.println("\n");
        //**************************************************************
        // startswith &endswith
        System.out.println(tr.startsWith("aj"));
        System.out.println(tr.startsWith("  aj"));
        System.out.println(tr.endsWith("ay  "));
        //*********************************************************
        //replace()
        String i="hello kavin how are you kavin, where are you from kavin ";
        System.out.println(i);
        String ir =i.replace("kavin","ajay");
        System.out.println(ir);
        System.out.println(tr.endsWith("ay  "));
        //*********************************************************
        //compare

        System.out.println( t.compareTo(tr));
        System.out.println("\n");
//************************************
        //contains
        System.out.println(i.contains("kavin"));
        System.out.println("\n");
//************************************
        //equalsignorecase

        System.out.println("eq="+t.equalsIgnoreCase(tr));
        System.out.println("\n");
        //********************************************
        //copy the value
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println(myStr2);
        //*********************************
    }
}
