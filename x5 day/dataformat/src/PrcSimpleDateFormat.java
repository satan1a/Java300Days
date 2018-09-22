import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * PrcSimpleDataFormat
 * @author satan1a
 * @date 2018.9.22
 */
public class PrcSimpleDateFormat {

    public static void main(String[] args) {
        Date date = new Date();
        String strDataFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strDataFormat);

        System.out.printf("The format date is: \n" + simpleDateFormat.format(date));
    }

}
