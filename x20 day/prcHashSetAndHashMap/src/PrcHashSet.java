import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * PrcHashSet
 * 对 HashSet 的练习
 * @author satan1a
 * @date 2018_10_7
 */
public class PrcHashSet {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet(100000);

        // 使用 add() 方法给 HashSet 添加元素对象
        while (hashSet.isEmpty()){
            for(int i = 0; i <= 1000; i++) {
                String string = String.format("Satan%da", i);
                hashSet.add(string);
            }
        }



        // 使用自带的迭代器方法生成迭代器 并遍历 HashSet
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
