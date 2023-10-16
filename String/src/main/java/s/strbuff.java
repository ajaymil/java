package s;

public class strbuff {

	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("hello");
        str.append(" milton");//append
        System.out.println(str);
        /**********************************************/
        str.insert(0,"hi");
        System.out.println(str);//insert
        str.replace(0,2,"how");// replace
        System.out.println(str);

        str.insert(3,"h");
        System.out.println(str);//insert
//****************************************** */
       str.delete(0, 4);
       System.out.println(str);//delete
       //*********************************************** */
       str.reverse();
       System.out.println(str);
       /*********************************** */
       str.capacity();
       System.out.println(str);
/*************************************************************************************/


	}


}
