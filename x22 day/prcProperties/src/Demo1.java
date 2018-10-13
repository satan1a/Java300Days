import java.text.DecimalFormat;
import java.util.Scanner;
class Demo1{
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入一个英文字符串或解密字符串");
//        String password = scan.nextLine();
//        char[] array = password.toCharArray();
//        for(int i = 0;i<array.length;i++){
//            array[i] = (char)(array[i]^"mluFnTvSfXj");
//        }
//        System.out.println("加密或解密结果如下：");
//        System.out.println(new String(array));
        twoStringXor("gv|rQvS}YjSmggF}guymlj|mmv","zUjmL");
    }
    public static String twoStringXor(String str1, String str2) {
        byte b1[] = str1.getBytes();
        byte b2[] = str2.getBytes();
        byte longbytes[],shortbytes[];
        if(b1.length>=b2.length){
            longbytes = b1;
            shortbytes = b2;
        }else{
            longbytes = b2;
            shortbytes = b1;
        }
        byte xorstr[] = new byte[longbytes.length];
        int i = 0;
        for (; i < shortbytes.length; i++) {
            xorstr[i] = (byte)(shortbytes[i]^longbytes[i]);
        }
        for (;i<longbytes.length;i++){
            xorstr[i] = longbytes[i];
        }
        return new String(xorstr);
    }
}

