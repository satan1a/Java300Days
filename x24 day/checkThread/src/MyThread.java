/**
 * MyThread
 * 测试用的线程类
 * @author satan1a
 * @date 2018_10_12
 */
public class MyThread implements Runnable {

    // synchronized 修饰，如果该类的一个对象有多个 synchronized 方法，
    // 则一个线程访问了其中一个 synchronized 方法，其它线程不能同时访问这个对象中的任何一个 synchronized 方法

    public synchronized void waitForASecond() throws InterruptedException {
        // wait() 方法 以毫秒计时间， 500ms 即 0.5 秒
        wait(500);

    }

    public synchronized void waitForYears() throws InterruptedException {
        // 不加参数为永久等待，直到其它线程调用 notify() 或 notifyAll() 方法
        wait();

    }

    public synchronized void notifyNow() throws InterruptedException{
        // 唤醒被 wait() 永久等待的线程
        notify();

    }


    @Override
    public void run() {
        try {
            // 在本测试中，会用 MyThread 类的对象创建新的 Thread 对象。故这是在 新线程中运行 waitForASecond() 方法
            waitForASecond();
            // 在 新线程中运行 waitForYears() 方法
            waitForYears();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}


