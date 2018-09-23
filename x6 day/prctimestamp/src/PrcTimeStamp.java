import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * PrcTimeStamp
 * 功能：使用 SimpleDataFormat 类的 format() 方法将时间戳转换成时间
 * @author satan1a
 * @date 2018.9.23
 */
public class PrcTimeStamp {

    public static void main(String[] args) {
        // 获取当前时间戳, 毫秒
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:s");
        // 关键：时间戳转换成时间,方法①
        String simpleDate = simpleDateFormat.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.printf("格式化时间_0： " + simpleDate + "\n");

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年 MM月 dd日 HH时 mm分 ss秒 s毫秒");
        // 关键：时间戳转换成时间,方法②
        String simpleDate1 = simpleDateFormat1.format(new Date(timeStamp));
        System.out.printf("格式化结果_1： " + simpleDate1 + "\n");

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年 MM月 dd日 HH时 mm分 ss秒 s毫秒");

        // // 关键：时间戳转换成时间,方法③,先把 long 转换成 string 再转换成 long
        String simpleDate2 = simpleDateFormat2.format(Long.parseLong(String.valueOf(timeStamp)));
        System.out.println("格式化结果_2： " + simpleDate2 + "\n");

    }
}
