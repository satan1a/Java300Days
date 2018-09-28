/**
 * PrcStringBuffer
 * 对 StringBuffer 的练习
 * @author satan1a
 * @date 2018.9.28
 */
public class PrcStringBuffer {

    public static void main(String[] args) {
        prcSringBuffer("abc");
    }

    private static void prcSringBuffer(String str) {
        // 初始化
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.printf(String.format("初始化后:              %s \n", stringBuffer));

        // append()
        stringBuffer.append("DEF!@#");
        System.out.printf(String.format("After append():        %s \n", stringBuffer));

        // insert()
        stringBuffer.insert(0,"temp");
        System.out.printf(String.format("After insert():        %s \n", stringBuffer));

        // delete()
        stringBuffer.delete(1,4);
        System.out.printf(String.format("After delete():        %s \n",stringBuffer));

        // deleteCharAt()
        stringBuffer.deleteCharAt(0);
        System.out.printf(String.format("After deleteCharAt():  %s \n", stringBuffer));

        // setCharAt()
        stringBuffer.setCharAt(0,'A');
        System.out.printf(String.format("After setCharAt():     %s \n", stringBuffer));

        // reverse()
        stringBuffer.reverse();
        System.out.printf(String.format("After reverse():       %s \n", stringBuffer));

        // trimToSize()
        stringBuffer.trimToSize();
        System.out.printf(String.format("After trimToSize():    %s \n", stringBuffer));

    }
}
