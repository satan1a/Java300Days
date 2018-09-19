import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * AlarmClock
 * @author satan1a
 * @date 2018/9/18
 */
public class AlarmClock {
    /**
     * 延迟时间
      */
    private int delay;
    /**
     * 启动计时的标志
      */
    private boolean flag;

    /**
     * 构造器，初始化域
     * @param delay
     * @param flag
     */
    public AlarmClock(int delay, boolean flag) {
        this.delay = delay;
        this.flag = flag;

    }

    public void start() {
        /**
            定义一个内部类并实现动作监听器
         */
        class Printer implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // 设置显示的日期格式
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("k:m:s");
                // 获得当前时间（以simpleDateFormat格式）
                String resultTime = simpleDateFormat.format(new Date());
                // 显示当前时间
                System.out.println("现在的时间是;" + resultTime);
                // 根据标志判断是否beep, 标志在定义时设置
                if (flag) {
                    Toolkit.getDefaultToolkit().beep();
                }

            }

        }
        // 特别注意：此栗子中使用的是 swing 中的 Timer，具体见 README。
        new javax.swing.Timer(delay, new Printer()).start();

    }

}

