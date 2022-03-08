package work;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaQ5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        LambdaQ5 a = new LambdaQ5();
        processWords(a.list);
    }

    public static String processWords(List<String> list) {
        StringBuilder Words = new StringBuilder();
        Consumer<String> person1 = p-> Words.append(p.charAt(0));

         list.stream().forEach(person1);
        System.out.println(Words);
        return  Words.toString();
    }
}