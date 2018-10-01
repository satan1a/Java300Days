import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;

/**
 * IteratorEnumeration
 * 通过 Iterator 和 Enumeration 遍历一个 Hashtable 来比较两者的效率
 * @author satan1a
 * @date 2018_10_1
 */
public class IteratorEnumeration {

    public static void main(String[] args) {
        int val;
        Random random= new Random();
        Hashtable hashtable = new Hashtable();
        for (int i = 0; i < 100000; i++) {
            // 随机获取一个[0,100]之间的数字
            val = random.nextInt(100);
            hashtable.put(String.valueOf(i), val);

        }

        // 通过 Iterator 遍历 Hashtable
        iterateHashtable(hashtable);

        // 通过 Enumeration 遍历 Hashtable
        enumHashtable(hashtable);
    }

    /**
     * 计算遍历时间 的方法
     * @param start
     * @param end
     */
    private static void countTime(long start, long end) {
        System.out.printf(String.format("time: " + (end - start) + " ms" + "\n"));
    }

    /**
     * Iterator 遍历 Hashtable 的方法
     * @param hashtable
     */
    private static void iterateHashtable(Hashtable hashtable) {
        long startTime = System.currentTimeMillis();

        Iterator iterator = hashtable.entrySet().iterator();

        // 遍历
        while (iterator.hasNext()) {
            iterator.next();

        }

        long endTime = System.currentTimeMillis();
        countTime(startTime, endTime);

    }

    /**
     * Enumeration 遍历 Hashtable
     * @param hashtable
     */
    private static void enumHashtable (Hashtable hashtable) {
        long startTime = System.currentTimeMillis();

        Enumeration enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();

        }

        long endtime = System.currentTimeMillis();
        countTime(startTime, endtime);

    }
}