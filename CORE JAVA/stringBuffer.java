public class stringBuffer 
{
	 public static void main(String[] args)
	 {
	 StringBuffer s = new StringBuffer("");
	 System.out.println(s);
	 s.append("StringBuffer");
	 s.append(" is a peer class of String");
	 s.append(" that Provides much of");
	 s.append(" the Functionality of Strings");
	 System.out.println(s);
	 StringBuffer str = new StringBuffer("It is Used to at The Specified Index Position.");
        System.out.println("String = " + str);
        str.insert(14, "Insert Text ");
        System.out.print("After Insertion = ");
        System.out.println(str.toString());
        StringBuffer stf = new StringBuffer("This Method Returns The Reversed Object on Which it Was Called in The Class");
        System.out.println("String Buffer = " + stf);
        stf.reverse();
        System.out.println("Reverse of The String Buffer = " + stf);
    }
	 }
