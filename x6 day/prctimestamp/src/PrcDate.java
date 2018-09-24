import java.util.Date;
import java.util.SplittableRandom;

/**
 * PrcDate
 * @author satan1a
 * @date 2018.9.24
 */
public class PrcDate {
    public static void main(String[] args) {
        // 系统当前时间
        Date dateNow = new Date();
        System.out.printf(String.format("系统当前时间是：%s", dateNow.toString()) + "\n");

        // 以指定值实例化一个 Date 对象
        Date dateOld = new Date(8000);
        System.out.printf(String.format("dateOld 是：%s", dateOld.toString()));

        // 各种 java.util.Date 类中的方法（可用的）进行日期比较
        System.out.printf(String.format("after() is: %b ", dateNow.after(dateOld)) + "\n");
        System.out.printf(String.format("before() is: %b ",dateNow.before(dateOld)) + "\n");
        System.out.printf(String.format("equals() is: %b", dateNow.equals(dateOld)) + "\n");
        System.out.printf(String.format("compareTo() is: %d", dateNow.compareTo(dateOld)) + "\n");

    }
}
