package work;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class LambdaQ7 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("E",9);
        map.put("T",6);
        map.put("K",7);

        LambdaQ7 t1 = new LambdaQ7();
        t1.convertKeyValueToString(map);

    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder str = new StringBuilder();
        Consumer<Map.Entry> consumer=(p)->str.append(p.getKey()).append(p.getValue());
        Set set  = map.entrySet();
        set.stream().forEach(consumer);
        System.out.println(str);
        return str.toString();


    }
}
