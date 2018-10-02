import java.util.Arrays;

/**
 * Range
 * 模仿python中的方法 range()， 生成一个整数等差序列（数组）
 * @author satan1a
 * @date 2018_10_2
 */
public class Range {
    public static int[] range(int from, int to ,int step) {
        int[] sequence = null;
        // 步长为 0 非法
        if (step == 0) {
            throw new IllegalArgumentException(String.valueOf(step));

        }
        // 递增序列则步长必须为正数，反之亦然
        // TODO
        if (!(from<to ^ step>0)) {
            sequence = new int[(int) Math.ceil((to - from) * 1.0 / step)];
            for (int i =0, len = sequence.length; i < len; from += step) {
                sequence[i++] = from;

            }

        } else {
            sequence = new int[0];

        }
        return sequence;

    }

    /**
     * 生成默认步长为 1 的整数等差序列(数组)
     *
     */
    public static int[] range(int from, int to) {
        return range(from, to ,1);

    }

    /**
     * 生成一个,默认从 0 开始，步长为1 的整数等差序列（数组）
     *
     */
    public static int[] range(int to) {
        return range(0, to, 1);

    }


    /**
     * 主函数，测试
     * @param args
     */
    public static void main(String[] args) {
        // 静态导入 range()
        for (int i: range(10)){
            System.out.print(i + ",");

        }

        System.out.println();
        System.out.println(Arrays.toString(range(1, 10, 2)));
        System.out.println(Arrays.toString(range(1, 10 ,-2)));
        System.out.println(Arrays.toString(range(1, -10, -2)));
        System.out.println(Arrays.toString(range(1, -10, 2)));
//        System.out.println(Arrays.toString(range(1, 10, 0)));

    }
}
