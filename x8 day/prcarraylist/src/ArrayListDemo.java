import java.util.ArrayList;
import java.util.List;

/**
 * ArrayListDemo
 * 循环遍历 ArrayList
 * @author satan1a
 * @date 2018.9.25
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建 ArrayList 列表
        List<Integer> list = new ArrayList<>();
        // 向列表中增加 10 个元素
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        // 输出列表中全部的元素
        System.out.printf(String.format("列表中的元素：" + list + "\n"));
        System.out.printf(String.format("列表中奇数序号元素："));
        for (int i = 1; i < list.size(); i += 2) {
            System.out.printf(list.get(i) + " ");
        }

    }

}
