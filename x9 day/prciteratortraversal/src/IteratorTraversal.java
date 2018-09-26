import java.util.ArrayList;
import java.util.Iterator;

/**
 * IteratorTraversal
 * 使用 Iterator 循环遍历 ArrayList 的练习
 * @author satan1a
 * @date 2018.9.26
 */
public class IteratorTraversal {

    public static void main(String[] args) {
        // 创建 ArrayList 数组列表
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 使用 for 循环赋值
        final int max = 10;
        for (int i = 1; i < max; i++) {
            // add() 方法，将指定元素添加到列表末尾
            arrayList.add(i);
        }

        // 使用 Iterator 遍历 ArrayList
        System.out.print("使用 Iterator 遍历 ArrayList\n");
        for(Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
        }
    }
}
