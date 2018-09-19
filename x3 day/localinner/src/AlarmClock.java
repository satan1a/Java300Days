import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlarmClock {
    private int delay;  // 延迟时间
    private boolean flag;   // 启动计时的标志

    public AlarmClock(int delay, boolean flag) {    // 构造器 constructor 初始化域
        this.delay = delay;
        this.flag = flag;

    }

    public void start() {

        class Printer implements ActionListener {  // 定义一个内部类并实现动作监听器

            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("k:m:s");  // 设置显示的日期格式
                String resultTime = simpleDateFormat.format(new Date());  // 获得当前时间（以simpleDateFormat格式）
                System.out.println("现在的时间是;" + resultTime);  // 显示当前时间
                if (flag) {  // 根据标志判断是否beep, 标志在定义时设置
                    Toolkit.getDefaultToolkit().beep();

                }

            }

        }
        new javax.swing.Timer(delay, new Printer()).start(); // 特别注意：此栗子中使用的是 swing 中的 Timer，具体见 README。

    }

}

