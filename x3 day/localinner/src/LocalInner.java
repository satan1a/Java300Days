import javax.swing.*;

/**
 * LocalInner
 * @author satan1a
 * @date 2018/9/18
 */
public class LocalInner {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock(1000, true);
        clock.start();
        JOptionPane.showMessageDialog(null, "是否退出？");
        System.exit(0);

    }

}
