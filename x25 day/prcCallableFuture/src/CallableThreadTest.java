import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * CallableThreadTest
 * 使用 Callable 和 FutureTask 创建多线程
 * @author Satan1a
 * @date 2018_10_16
 */
public class CallableThreadTest implements Callable {
    public static void main(String[] args) {
        CallableThreadTest ctt = new CallableThreadTest();
        FutureTask<Integer> ft = new FutureTask<>(ctt);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "的循环变量的值: " + i);
            if (i == 20) {
                new Thread(ft,"有返回值的线程").start();
            }
        }

        try {
            System.out.println("子线程的值: " + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }


    /**
     * call() 方法有返回值
     */
    @Override
    public Object call() throws Exception {
        int i = 0;
        for ( ; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}
