package work;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;


public class LambdaQ3 {
	static void modifyValue(){  }
    static class Product {
    	private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
    }
    static void display() { }
	public static void main(String[] args) {
	//1)Supplier --- only output
		Supplier<Double> getRandomDouble = () ->Math.random();
		System.out.println(getRandomDouble.get());     //NO OUTPUT
		//2)Consumer ---only consumes data
			{
			Product p = new Product();
			Consumer<Product>setName = t -> t.setName("PARLE-G");
		setName.accept(p);
		System.out.println(p.getName());
			}
			//3)Predicate--boolean result
			Predicate<String>stringLength = str -> str.length()>5;
			//checking if length of string >5 --true--else--false
			System.out.println(stringLength.test("CAPGEMINI HYDERABAD"));
			//4)Function-- supplies data no output
			Function<Integer,String>getInt = t -> t*4 + "Data Multiplied By 4";
			System.out.println(getInt.apply(2));
			
			

	}

}
