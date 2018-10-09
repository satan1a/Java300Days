import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * PrcProperties
 * 对 Properties 类的练习，包括文件流相关
 * 核心代码，非完整。
 * @author satan1a
 * @date 2018_10_9
 */
public class PrcProperties {

    public static void main(String[] args) throws Exception {
        // Properties 属性集合对象
        Properties prop = new Properties();
        // 属性文件输入流
        FileInputStream fileInputStream = new FileInputStream("prop.properties");

        // 将属性文件输入流加载到 Properties 属性集合对象中，抛出IOException异常
        prop.load(fileInputStream);
        // 关闭流
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream("prop.properties");
        fileOutputStream.close();
    }
}
