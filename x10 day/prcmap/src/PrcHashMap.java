import java.util.HashMap;
import java.util.Random;

/**
 * PrcHashMap
 * 对 HashMap 的初次练习
 * @author satan1a
 * @date 2018.9.27
 */
public class PrcHashMap {

    public static void main(String[] args) {
        testHashMapAPIs();
    }

    private static void testHashMapAPIs() {
        // 初始化随机数种子
        Random random = new Random();
        // 新建 HashMap
        HashMap hashMap = new HashMap();
        // 添加操作 put()
        hashMap.put("one", random.nextInt(10));
        hashMap.put("two", random.nextInt(10));
        hashMap.put("three", random.nextInt(10));

        // 打印 HashMap
        System.out.println("HashMap: \n" + hashMap);

        // 打印 HashMap 键值对
        System.out.println("Key - Value: \n" + hashMap.entrySet());

    }
}
