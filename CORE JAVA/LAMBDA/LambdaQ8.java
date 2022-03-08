package work;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaQ8 {
	    public static void main(String[] args) {
	        ArrayList <Integer> j = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	        Consumer<List<Integer> > consumerlist = list -> list.stream().forEach(n -> System.out.print(" " +n));
	        Thread t = new Thread(()->consumerlist.accept(j));
	        t.start();

	    }
}