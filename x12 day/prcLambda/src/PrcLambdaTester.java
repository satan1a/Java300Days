public class PrcLambdaTester {

    public static void main(String[] args) {
        // 类型声明的 Lambda 表达式
        MyOwnAddWay addition  = (int a, int b) ->a - b;

        int testA = 10;
        int testB = 5;
        System.out.println(" 10 + 5 = " + new PrcLambdaTester().operate(testA, testB, addition));


    }

    interface MyOwnAddWay {
        int operation(int a, int b);

    }

    private int operate(int a, int b, MyOwnAddWay myOwnAddWay) {
        return myOwnAddWay.operation(a, b);

    }
}
