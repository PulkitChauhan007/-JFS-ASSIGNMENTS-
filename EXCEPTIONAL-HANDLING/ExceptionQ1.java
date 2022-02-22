public class ExceptionQ1 {
	public static void main(String[] args)
	 {
	        int firstnumber = 7;
	        int secondnumber = 0;
	        try {
	            System.out.println(firstnumber / secondnumber); 
	        }
	        catch (ArithmeticException f){	           
	            System.out.println(" When there is an attempt to divide a number by zero it is Exception");
	        }
	    }
	}