package work;

interface Arithmetic{
	 double Num(int num1 , int num2);
	 
}

public class LambdaQ1 {
	
	public static void main(String[] args) {
		Arithmetic Addition = (int num1 , int num2) -> num1 + num2;
		System.out.println(Addition.Num(13 , 5));
		Arithmetic Substraction = (int num1 , int num2) -> num1 - num2;
		System.out.println(Substraction.Num(13 , 5));
		Arithmetic Multiplication = (int num1 , int num2) -> num1 * num2;
		System.out.println(Multiplication.Num(13 , 5));
		Arithmetic Division = (int num1 , int num2) -> num1 / num2;
		System.out.println(Division.Num(13 , 5));
	
	}

}
