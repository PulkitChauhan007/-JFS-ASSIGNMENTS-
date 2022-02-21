import java.util.HashSet;
import java.util.Set;
public class GenericsQ1{		    
		  //  Here i am creating a HashSet
	      public static void main(String[] args) {
		        Set<String> EMPLOYEE = new HashSet<>();	        
		        {
		        // Adding five new elements to the HashSet
		        EMPLOYEE.add("ID - CAPGEMINI007");
		        EMPLOYEE.add("NAME - PULKIT CHAUHAN");
		        EMPLOYEE.add("SALARY PACKAGE - 4lac cTc");
		        EMPLOYEE.add("DEPARTMENT - ENGINEERING ANALYST");
		        EMPLOYEE.add("COMPANY NAME - CAPGEMINI (HYDERABAD)");
		        System.out.println(EMPLOYEE);
		          }	
		        } 
	      }