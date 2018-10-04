import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * PrcProperties
 * 对 Properties 类的练习
 * @author satan1a
 * @date 2018_10_4
 */
public class PrcProperties {

    public static void main(String[] args) {
        Properties properties = new Properties();

        // 向 Properties 中增加属性
        properties.setProperty("username", "satan1a");
        properties.setProperty("password", "123456");

        // 将 Properties 中的属性保存到 a.ini 文件中
        try {
            properties.store(new FileOutputStream("a.ini"), "initial comment");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 新建另一个 Properties 对象
        Properties properties_1 = new Properties();
        // 将 a.ini 文件中的属性名-属性值追加到 properties_1 中
        properties_1.setProperty("gender", "demon");
        try {
            properties_1.load(new FileInputStream("a.ini"));
            properties_1.store(new FileOutputStream("b.ini"), "second comment");
            System.out.println(properties_1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



