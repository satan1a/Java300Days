/**
 * PtcTryCatch
 * 对Java异常处理的练习
 * @author satan1a
 * @date 2018_10_3
 */
public class PrcTryCatch {

    public static void main(String[] args) {
        int a[] = new int[2];
        try{
            System.out.println("Access element three： " + a[3]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oh ho! Exception thrown：" + e);
        }
        finally {
            a[0] = 6;
            System.out.println("First element value：" + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}

