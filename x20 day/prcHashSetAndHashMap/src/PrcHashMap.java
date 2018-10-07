import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * PrcHashSet
 * 对 HashMap 的练习
 * @author satan1a
 * @date 2018_10_7
 */
public class PrcHashMap {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap(10000);

        for (int i = 0; i <= 1000; i++) {
            String string = String.format("satan%da", i);
            hashMap.put(i, string);

        }
        Iterator iterator = hashMap.entrySet().iterator();

        // 遍历 HashMap 的第一种方法（效率高，优先）
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(String.format("The key is: %s  The value is: %s", entry.getKey(), entry.getValue()));
        }

        // 用 foreach 的方法遍历 HashMap
        for (Object key: hashMap.keySet()) {
            System.out.println(key);
        }
        for (Object value:
                hashMap.values()) {
            System.out.println(value);
        }

//        for (Object value: hashMap.values()) {
//            System.out.println(value);
//        }

    }
}
