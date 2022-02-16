public class stringBuilder {
	public static void main(String[] args)
	 {
	 StringBuffer s = new StringBuffer("");
	 System.out.println(s);
	 s.append("StringBuffer");
	 s.append(" is a peer class of String");
	 s.append(" that provides much of");
	 s.append(" the functionality of strings");
	 System.out.println(s);
	 StringBuffer str = new StringBuffer("It is used to at the specified index position");
       System.out.println("string = " + str);
       str.insert(14, "insert text ");
       System.out.print("After insertion = ");
       System.out.println(str.toString());
       StringBuffer abc = new StringBuffer("This method returns the reversed object on which it was called");
       System.out.println("String buffer = " + abc);
       abc.reverse();
       System.out.println("String buffer after reversing = " + abc);
   }
	 }