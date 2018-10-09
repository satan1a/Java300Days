import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * PrcProperties
 * 对 Properties 类的练习，包括文件流相关
 * 核心代码，非完整。
 * @author satan1a
 * @date 2018_10_9
 */
public class PrcProperties {

//    public static void main(String[] args) throws Exception {
//        // Properties 属性集合对象
//        Properties prop = new Properties();
//        // 属性文件输入流
//        FileInputStream fileInputStream = new FileInputStream("prop.properties");
//
//        // 将属性文件输入流加载到 Properties 属性集合对象中，抛出IOException异常
//        prop.load(fileInputStream);
//        // 关闭流
//        fileInputStream.close();
//
//        FileOutputStream fileOutputStream = new FileOutputStream("prop.properties");
//        fileOutputStream.close();
//    }

    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        // Show all the states and capitals (like a hashtable)
        states = capitals.keySet();
        Iterator iterator = states.iterator();

        while (iterator.hasNext()) {
            str = (String)iterator.next();
            System.out.println(String.format("The capital of %s is %s.",
                    str, capitals.getProperty(str)));

        }
        System.out.println();

        // look for state not in list -- specify default
        str = capitals.getProperty("Florida", "Not Found");
        System.out.println(String .format("The capital of Florida is %s.",
                str));

    }

}

