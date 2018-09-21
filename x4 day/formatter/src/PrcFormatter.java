import java.util.Formattable;
import java.util.Formatter;

public class PrcFormatter {
    /**
     * 实现 Formattable 接口
     */
    public static class Formatter implements Formattable {

        @Override
        public void formatTo(java.util.Formatter formatter, int flags, int width, int precision) {
            formatter.format("我是 Formattable 接口的实现类");

        }
    }


    /**
     * 主函数
     */
    public static void main(String[] args) {
        PrcFormatter.Formatter prc = new PrcFormatter.Formatter();

        Formatter formatter = new Formatter();

        System.out.printf(String.format("大家好，我叫：%1$s，今年：%2$-,( 20.3f岁。%1$s是%3$s的爸爸","小明",-255555555.2333333f,"小小明"));

    }
}


