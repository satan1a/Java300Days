/**
 * PrcThread
 * 继承 Thread 类 创建多线程
 */
public class PrcThread {

    public static void main(String[] args) {
        Thread1 mTh1 = new Thread1("A");
        Thread1 mTh2 = new Thread1("B");
        mTh1.start();
        mTh2.start();

    }
}


/**
 * 线程类
 * 继承 Thread 实现
 */
class Thread1 extends Thread {
    private String name;

    /**
     * 构造器
     * @param name
     */
    public Thread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("%s 运行 ：%d ",name, i));

            try {
                // 为展示多线程，使用随机数休眠线程并输出 来只管展示多线程
                sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
