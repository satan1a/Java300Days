import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        final Timer timer = new Timer();    // 声明一个计数器

        final TimerTask timerTask = new TimerTask() {   // 声明一个计时任务
            int count = 3;  // 执行三次，三次后结束计时器

            @Override
            public void run() {
                Toolkit.getDefaultToolkit().beep(); // 执行的任务，让主板beep三次然后输出beep记录
                System.out.println("beep....");
                if (--count <= 0) {
                    System.out.println("Timer is canceled.");
                    this.cancel();  // 取消该任务
                    timer.cancel(); // 取消计时器
                }
            }
        };
        // 设定计时器，100毫秒后启动计时器任务，每个1000毫秒再启动一次
        timer.schedule(timerTask, 100, 1000);
    }
}
