package work;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

class  convertToUpperCase implements UnaryOperator<String>
{
    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
}
public class LambdaQ6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("whaT", "dO", "yoU", "wanT", "froM", "mE", "brO", "gO", "gO");
        LambdaQ6 l1 = new LambdaQ6();
        System.out.println(l1.convertToUpperCase(list));
    }
    public List<String> convertToUpperCase(List<String> list) {
        List<String> ToUpper = new ArrayList<>();
        Consumer<String> consumer = (str)->ToUpper.add(str.toUpperCase());
        list.stream().forEach(consumer);
        return  ToUpper;
    }
}