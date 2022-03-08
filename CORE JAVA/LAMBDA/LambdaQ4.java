package work;

import java.util.ArrayList;
public class LambdaQ4 {
	public static void main(String[] args) {
		   ArrayList<String> employeeList = new ArrayList<String>();
		   employeeList.add("Milind");
	        employeeList.add("Pulkit");
	        employeeList.add("Mujahid");
	        employeeList.add("Sukumar");
	        employeeList.removeIf(s -> ((s.length())%2 != 0));
	        System.out.println(employeeList);
	}

}

