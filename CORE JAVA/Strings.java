public class Strings{
		public static void main(String args[]){
		String str1="Java String Pool Refers to Collection of Strings Which Are Stored in Heap Memory";
		String lowercase=str1.toLowerCase();
		System.out.println(lowercase);
String Uppercase=str1.toUpperCase();  
System.out.println(Uppercase);
String replaceStr=str1.replace('a','$'); 
System.out.println(replaceStr);
System.out.println(str1.contains("collection"));
String str2="java string pool refers to collection of strings which are stored in heap memory";
System.out.println(str1.equals(str2));
System.out.println(str1==str2);
		}
	}

