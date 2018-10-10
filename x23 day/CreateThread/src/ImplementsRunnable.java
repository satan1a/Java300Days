
/**
 * Implements Runnable
 * 实现 Runnable 接口 创建多线程
 */
public class ImplementsRunnable {

    public static void main(String[] args) {
        // new Thread 新建线程性能差 且 缺乏统一管理和更多的功能，
        // 应使用 Java线程池，下面的写法仅用于练习，明日补齐 线程池 内容
        new Thread(new Thread2("C")).start();
        new Thread(new Thread2("D")).start();

    }
}

class Thread2 implements Runnable {
    private String name;

    /**
     * 构造器
     * @param name
     */
    public Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(String.format("%s 运行 ：%d ",name, i));

            try {
                // 为展示多线程，使用随机数休眠线程并输出 来只管展示多线程
                Thread.sleep((int)(Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
