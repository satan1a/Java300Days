import java.util.Iterator;
import java.util.Vector;

/**
 * PrcVector
 * 对 Vector 类的练习
 * @author satan1a
 * @date 2018_10_8
 */
public class PrcVector {

    public static void main(String[] args) {
        Vector vector = new Vector();

        for (int i = 0; i < 4; i++) {
            String string = String.format("Satan%da", i);
            vector.add(string);

        }
        vector.add("Satan2a");
//        showVector(vector);


        // 按照内容删除元素,如果有多个，则一次只删除一个
        vector.remove("Satan2a");
        showVector(vector);
        System.out.println();

        // 按照索引号删除元素
        vector.remove(0);
        showVector(vector);
        System.out.println();

        // 获得 Vector 中现有的元素个数
        System.out.println(vector.size());


    }

    /**
     * 遍历 Vector
     * @param vector
     */
    public static void showVector(Vector vector) {
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
