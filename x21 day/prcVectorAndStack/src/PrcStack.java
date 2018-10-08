import java.util.Stack;

/**
 * PrcStack
 * 对 Stack 类的练习
 * 利用 Stack 实现倒序输出
 * @author satan1a
 * @date 2018_10_8
 */
public class PrcStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        String string = "Satan1a Number One Forever!";

        for (String s: string.split("")) {
            stack.push(s);
        }

        while (!stack.empty()) {
            System.out.printf(stack.pop() + "");
        }

    }
}
