import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * PrcLambda
 * 对 Lambda 匿名函数的练习,
 * 以下为不使用 Lambda 的版本
 * @author satan1a
 * @date 2018_9_29
 */
public class PrcLambda {



    public static void main(String[] args) {

        String string = "Satania,tom,,jim,Berry,kitty,Anna";
        // String 转化为 ArrayList 列表的方法：第一步，用 split 将字符串分割为字符数组； 第二步，使用 Arrays 的 asList 方法，将数组转化为列表
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(string.split(",")));

        // 定义原始字符数组
        String[] stringsList = string.split(",");

        // 按原始顺序输出字符串数组中的字符串元素
        System.out.printf("按原始顺序输出字符串数组中的字符串元素: \n");
        for (String s: stringsList) {
            System.out.printf(s.toUpperCase() + " ");

        }
        System.out.println("\n");

        // 按自己实现的 Comparator 来 sort()
        Arrays.sort(stringsList, new LengthComparator());
        System.out.println("按照自己实现的 Comparator 来 sort()" + "\n");
        for (String s: stringsList) {
            System.out.printf(s.toUpperCase() + " ");

        }

    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // 根据字符串长度来排序
        return Integer.compare(o1.length(), o2.length());

    }
}


