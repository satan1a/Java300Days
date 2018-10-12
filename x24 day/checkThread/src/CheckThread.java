/**
 * CheckThread
 * 线程状态的测试，对 MyThread 线程类
 * @author satan1a
 * @date 2018_10_12
 */
public class CheckThread {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        // 利用 myThread 对象来创建新线程对象 thread
        // 则 thread 对象的 run() 方法会继承 myThread 中的方法，start() 后，会运行 myThread 对象中的 run() 方法
        Thread thread = new Thread(myThread);
        System.out.println("新建线程：" + thread.getState());

        thread.start();    // 启动新线程
        System.out.println("启动线程：" + thread.getState());

        // 当前线程休眠 0.1 秒，使新线程运行 waitForASecond() 方法
        Thread.sleep(100);
        System.out.println("计时等待：" + thread.getState());

        // 当前线程休眠 1 秒， 使新线程运行 waitForYears() 方法
        Thread.sleep(1000);
        System.out.println("等待线程：" + thread.getState());

        // 调用 myThead 的 notifyNow() 方法
        myThread.notifyNow();
        System.out.println("唤醒线程：" + thread.getState());

        // 当前线程休眠 1 秒。使新线程 thread 结束
        Thread.sleep(1000);
        System.out.println("终止线程：" + thread.getState());

    }

}

