import java.util.Scanner;

/**
 * 本项目是对Java使用异或加解密字符串的练习
 * 知识点：toCharArray 方法，异或运算, System.err.println
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你要加密或解密的字符串：");
        String password = scan.nextLine();
        char[] array = password.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] ^ 20000);

        }

        System.err.println("最终字符串为：" + new String(array));

    }
}
