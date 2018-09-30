import java.util.LinkedList;

/**
 * StringStack
 * 使用 LinkedList 实现的字符串 堆栈
 * @author satan1a
 * @date 2018_9_30
 */
public class StringStack {
    private LinkedList<String> linkedList = new LinkedList<>();

    /**
     * 入栈
     * 将元素加入到 LinkedList 容器
     * 即 插入到链表 linkList 的第一个位置
     */
    public void push(String name) {
        linkedList.addFirst(name);

    }

    /**
     * 获取栈顶元素
     * 即 取出链表 linkList 的第一个元素（从上往下数第一个）
     */
    public String getTop() {
        return linkedList.getFirst();

    }

    /**
     * 出栈
     * 获取并删除最上面的元素
     * 即 移出链表 linkList 的第一个元素（从上往下数第一个）
     */
    public String pop() {
        return linkedList.removeFirst();

    }

    /**
     * 获取堆栈里面的元素个数
     */
    public int size() {
        return linkedList.size();

    }

    /**
     * 判断堆栈是否为空
     * 即 判断链表 linkList 是否为空
     */
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    /**
     * 遍历输出堆栈全部元素
     */
    public void printAll() {
        while (!linkedList.isEmpty()) {
            System.out.printf("\t" + linkedList.pop() + "\n");
        }
    }


    /**
     * 测试
     */
    public static void main(String[] args) {
        StringStack stringStack = new StringStack();
        System.out.printf("元素入栈\n" + "----------\n");
        stringStack.push("小白");
        stringStack.push("小蓝");
        stringStack.push("小黑");
        stringStack.push("Satan1a Number One ε=( o｀ω′)ノ");

        System.out.printf("第一个元素是:\n");
        System.out.printf(stringStack.getTop());

        System.out.println();

        System.out.printf("全部元素:\n");
        stringStack.printAll();
    }
}
